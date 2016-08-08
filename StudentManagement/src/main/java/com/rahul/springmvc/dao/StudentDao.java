package com.rahul.springmvc.dao;

import com.rahul.springmvc.model.Student;

public interface StudentDao {
	public void addStudent(Student student);
	public Student getStudent(int id);
	public void deleteStudent(int id);
	public void updateStudent(Student student);
}
