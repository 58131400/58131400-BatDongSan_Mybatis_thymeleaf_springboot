package com.example.thai.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.templateresolver.ITemplateResolver;
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer{

	

	@Override 
	public void addResourceHandlers(ResourceHandlerRegistry registry) 
	{ 
		registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/"); 
		registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/"); 
		registry.addResourceHandler("/images/**").addResourceLocations("classpath:/static/images/");
		registry.addResourceHandler("/sb-admin/**").addResourceLocations("classpath:/static/sb-admin/"); 
	registry.addResourceHandler("/jquery-ui/**").addResourceLocations("classpath:/static/jquery-ui/");
	registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/static/webjars/");
	registry.addResourceHandler("/admin/jquery-ui/**").addResourceLocations("classpath:/static/jquery-ui/");
	}
	//da ngon ngu
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	    registry.addInterceptor(localeChangeInterceptor());
	}
	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver slr = new SessionLocaleResolver();
		slr.setDefaultLocale(Locale.US);
		return slr;
	}
	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
	    LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
	    lci.setParamName("lang");
	    return lci;
	}
	
	//thymeleaf security dialect
	@Bean
	public SpringTemplateEngine templateEngine(ITemplateResolver templateResolver, SpringSecurityDialect sec) {
	    final SpringTemplateEngine templateEngine = new SpringTemplateEngine();
	    templateEngine.setTemplateResolver(templateResolver);
	    templateEngine.addDialect(sec); // Enable use of "sec"
	    return templateEngine;
	}
	@Bean
    public SpringSecurityDialect securityDialect() {
        return new SpringSecurityDialect();
    }
}
