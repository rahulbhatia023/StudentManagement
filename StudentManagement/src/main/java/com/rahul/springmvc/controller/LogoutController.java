package com.rahul.springmvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController
{
	@RequestMapping(value = "/logout")
	public ModelAndView logout(HttpSession session)
	{
		session.removeAttribute("isUserLoggedIn");
		session.invalidate();
		
		ModelAndView model = new ModelAndView("HomePage");
		return model;
	}
}
