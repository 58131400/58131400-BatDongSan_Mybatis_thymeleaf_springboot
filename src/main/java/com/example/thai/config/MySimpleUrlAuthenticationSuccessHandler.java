package com.example.thai.config;

import java.io.IOException;
import java.security.Security;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.example.thai.dao.AccountDAO;
import com.example.thai.entity.User;



public class MySimpleUrlAuthenticationSuccessHandler implements AuthenticationSuccessHandler 
{
	protected org.apache.commons.logging.Log logger =org.apache.commons.logging.LogFactory.getLog(this.getClass());
	
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	@Autowired
	private AccountDAO accountDAO;
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		// TODO Auto-generated method stub
		handle(request,response,authentication);
		clearAuthenticationAttributes(request);
	}
	protected void handle(HttpServletRequest request, 
		      HttpServletResponse response, Authentication authentication)
		      throws IOException 
	{		  
        String targetUrl = determineTargetUrl(authentication); 
        if (response.isCommitted()) 
        {
            logger.debug(
              "Response has already been committed. Unable to redirect to "
              + targetUrl);
            return;
        } 
        redirectStrategy.sendRedirect(request, response, targetUrl);
	}
		 
    protected String determineTargetUrl(Authentication authentication) {
        boolean isUser = true;
        boolean isAdmin = false;
        // TH dung ten quyen de xac dinh admin hay user
//        Collection<? extends GrantedAuthority> authorities
//         = authentication.getAuthorities();
//        for (GrantedAuthority grantedAuthority : authorities) {
//        	String authority = grantedAuthority.getAuthority();
//            if (authority.equals("Login admin")) {
//                isAdmin = true;
//                isUser= false;
//                break;
//            }
//            
//        }
        
        // TH:dung role de xac dinh
        authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = accountDAO.findAccount(authentication.getName());
        if(user.getFkNhomnguoidungid()==1)
        {
        	isUser = false;
        	isAdmin = true;
        }
        
        if (isUser) {
            return "/accountInfo";
        } else if (isAdmin) {
            return "/admin/home";
        } else {
            throw new IllegalStateException();
        }
    }
		 
    protected void clearAuthenticationAttributes(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) 
        {
            return;
        }
        session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
    }
 
    public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
        this.redirectStrategy = redirectStrategy;
    }
    protected RedirectStrategy getRedirectStrategy() {
        return redirectStrategy;
    }

}
