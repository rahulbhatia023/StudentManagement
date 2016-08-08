package com.rahul.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.rahul.springmvc.dao.StudentDao;
import com.rahul.springmvc.model.Student;

@Controller
@SessionAttributes("isUserLoggedIn")
public class StudentController
{
	@Autowired
	private StudentDao studentDao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getHomePage(Model model)
	{
		if(model.containsAttribute("isUserLoggedIn"))
			return new ModelAndView("WelcomePage");
		
		return new ModelAndView("HomePage");
	}
	
	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public ModelAndView getSignUpPage()
	{
		return new ModelAndView("SignUp");
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.GET)
	public ModelAndView addStudent()
	{
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	
	@RequestMapping(value = "/addStudentInfo", method = RequestMethod.POST)
	public ModelAndView addStudentInformation(@ModelAttribute("student") Student student)
	{
		studentDao.addStudent(student);
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		return model;
	}
	
	@RequestMapping(value = "/getStudent", method = RequestMethod.GET)
	public ModelAndView getStudent()
	{
		ModelAndView model = new ModelAndView("GetStudentInfo");
		return model;
	}
	
	@RequestMapping(value = "/getStudentInfo", method = RequestMethod.POST)
	public ModelAndView getStudentInfo(@RequestParam("studentId") int id)
	{
		Student student = studentDao.getStudent(id);
		ModelAndView model = new ModelAndView("StudentInformation");
		model.addObject("student", student);
		return model;
	}
	
	@RequestMapping(value = "/updateStudent", method = RequestMethod.POST)
	public ModelAndView updateStudent(@RequestParam("studentId") int id)
	{
		Student student = studentDao.getStudent(id);
		ModelAndView model = new ModelAndView("UpdateStudent");
		model.addObject("student", student);
		return model;
	}
	
	@RequestMapping(value = "/updateStudentInfo", method = RequestMethod.POST)
	public ModelAndView updateStudentInformation(@ModelAttribute("student") Student student)
	{
		studentDao.updateStudent(student);
		ModelAndView model = new ModelAndView("UpdateSuccess");
		return model;
	}
	
	@RequestMapping(value = "/deleteStudent", method = RequestMethod.POST)
	public ModelAndView deleteStudent(@RequestParam("studentId") int id)
	{
		studentDao.deleteStudent(id);
		ModelAndView model = new ModelAndView("DeleteStudent");
		return model;
	}
}
