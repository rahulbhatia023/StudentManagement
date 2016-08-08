package com.rahul.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rahul.springmvc.dao.AdminDao;
import com.rahul.springmvc.model.Admin;
import com.rahul.springmvc.model.LoginCredentials;

@Controller
public class AdminController
{
	@Autowired
	private AdminDao adminDao;
	
	@InitBinder
    public void initBinder(WebDataBinder binder) 
	{
        binder.registerCustomEditor(Date.class, "birthDate", new CustomDateEditor(new SimpleDateFormat("MM/dd/yyyy"), true));
    }
	
	@RequestMapping(value = "/signIn", method = RequestMethod.POST)
	public ModelAndView getLoginPage(Model model)
	{
		return new ModelAndView("LoginPage");
	}
	
	@RequestMapping(value = "/signUpAdmin", method = RequestMethod.POST)
	public ModelAndView signUpAdmin(@Validated @ModelAttribute("admin") Admin admin, BindingResult result)
	{
		if(result.hasErrors())
			return new ModelAndView("SignUp");
		
		LoginCredentials loginCredentials = new LoginCredentials();
		loginCredentials.setUserName(admin.getEmailId());
		loginCredentials.setPassword(admin.getPassword());
		
		adminDao.createAdmin(admin, loginCredentials);
		return new ModelAndView("AdminCreationSuccess");
	}
}
