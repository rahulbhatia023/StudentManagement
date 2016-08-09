package com.rahul.springmvc.dao;

import java.util.List;

import com.rahul.springmvc.model.Student;

public interface StudentDao {
	public void addStudent(Student student, String adminId);
	public Student getStudent(String emailId);
	public void deleteStudent(String emailId);
	public void updateStudent(Student student);
	public List<?> getStudentList(String adminId);
}
