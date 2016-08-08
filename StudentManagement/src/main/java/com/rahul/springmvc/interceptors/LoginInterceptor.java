package com.rahul.springmvc.interceptors;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter
{
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException
	{
		if(!(request.getRequestURI().equals("/StudentManagement/") || 
			 request.getRequestURI().equals("/StudentManagement/submitLoginPage") || 
			 request.getRequestURI().equals("/StudentManagement/signIn") ||
			 request.getRequestURI().equals("/StudentManagement/signUp") ||
			 request.getRequestURI().equals("/StudentManagement/signUpAdmin")))
		{
			if(request.getSession().getAttribute("isUserLoggedIn") != null && (boolean)request.getSession().getAttribute("isUserLoggedIn"))
				return true;
			else
				response.sendRedirect("./");
		}
		
		return true;
	}
}
