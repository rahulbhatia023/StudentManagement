package com.rahul.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.rahul.springmvc.dao.LoginDao;
import com.rahul.springmvc.model.LoginCredentials;

@Controller
@SessionAttributes({"isUserLoggedIn", "userName"})
public class LoginController
{
	@Autowired
	private LoginDao loginDao;
	
	@RequestMapping(value = "/submitLoginPage", method = RequestMethod.POST)
	public ModelAndView submitLoginPage(@ModelAttribute("loginCredentials") LoginCredentials loginCredentials)
	{
		boolean isAuthenticatedUser = loginDao.authenticateUser(loginCredentials.getUserName(), loginCredentials.getPassword());
		
		if(isAuthenticatedUser)
		{
			ModelAndView model = new ModelAndView("WelcomePage");
			model.addObject("isUserLoggedIn", true);
			model.addObject("userName", loginCredentials.getUserName());
			return model;
		}
		
		ModelAndView model = new ModelAndView("ErrorPage");
		model.addObject("message", "You are not an authenticated user");
		
		return model;
	}
}
