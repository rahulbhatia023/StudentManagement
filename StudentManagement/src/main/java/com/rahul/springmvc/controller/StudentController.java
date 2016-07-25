package com.rahul.springmvc.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController
{
	private final static Logger log = Logger.getLogger(StudentController.class);
	
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public ModelAndView getLoginPage()
	{
		ModelAndView model = new ModelAndView("LoginPage");
		return model;
	}
	
	@RequestMapping(value ="/submitLoginPage", method = RequestMethod.POST)
	public ModelAndView submitLoginPage(@RequestParam Map<String, String> reqParams)
	{
		log.info("In submitLoginPage() method");
		
		String userName = reqParams.get("userName");
		String password = reqParams.get("password");
		
		log.info("userName: " + userName);
		log.info("password: " + password);
		
		ModelAndView model = new ModelAndView("WelcomePage");
		model.addObject("message", "Hello " + userName);
		return model;
	}
}
