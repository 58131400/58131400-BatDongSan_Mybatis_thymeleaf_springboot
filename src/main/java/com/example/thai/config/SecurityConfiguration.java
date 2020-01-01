package com.example.thai.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.thai.Service.UserDetailServiceImpl;

import com.example.thai.config.MySimpleUrlAuthenticationSuccessHandler;;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private UserDetailServiceImpl userService;
	 @Bean("authenticationManager")
	    @Override
	    public AuthenticationManager authenticationManagerBean() throws Exception {
	            return super.authenticationManagerBean();
	    }
		@Bean 
		public BCryptPasswordEncoder passwordEncoder() { 
			BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(); 
			return bCryptPasswordEncoder; 
			} 

	@Bean
	public DaoAuthenticationProvider authenticationProvider(UserDetailServiceImpl userService) {
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(userService);
		authenticationProvider.setPasswordEncoder(bCryptPasswordEncoder);
		return authenticationProvider;
	}
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        // @formatter:off
        auth.inMemoryAuthentication()
            .withUser("user1").password("{noop}user1Pass").roles("USER")
            .and()
            .withUser("admin1").password("{noop}admin1Pass").roles("ADMIN");
        // @formatter:on
        auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
    }
	@Override
	protected void configure(AuthenticationManagerBuilder auth) {
		
		auth.authenticationProvider(authenticationProvider(userService));
	}

    @Bean
    public AuthenticationSuccessHandler myAuthenticationSuccessHandler(){
        return new MySimpleUrlAuthenticationSuccessHandler();
    }
 
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.rememberMe().key("uniqueAndSecret").tokenValiditySeconds(1296000);
		
		
		http.authorizeRequests()
				.antMatchers("/","/home").permitAll()
				.antMatchers("/login").permitAll()
				.antMatchers("/thanhtich","/**").permitAll()
				.antMatchers("/registration").permitAll()
				//.antMatchers("/admin/home").hasAuthority("ROLE_ADMIN")
				.anyRequest()
				.authenticated()
			.and().csrf().disable().formLogin()
				.loginPage("/login")
				.loginProcessingUrl("/j_spring_security_check")
				.successHandler(myAuthenticationSuccessHandler())
				.failureUrl("/login?error=true")
				//.defaultSuccessUrl("/")
				.usernameParameter("username")
				.passwordParameter("password")	
			.and().logout()
				.deleteCookies("JSESSIONID")
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
			.and().exceptionHandling()
				.accessDeniedPage("/access-denied")
				
				.and().rememberMe().key("uniqueAndSecret").tokenValiditySeconds(86400);
		
	}
	@Override
	public void configure(WebSecurity web) throws Exception
	{ 
		web.ignoring().antMatchers("/css/**","/js/**","/sb-admin/**","/webjars/**","/jquery-ui/**","/images/**"); 
	}

}
