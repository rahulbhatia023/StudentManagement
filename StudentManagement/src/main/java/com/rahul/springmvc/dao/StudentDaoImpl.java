package com.rahul.springmvc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rahul.springmvc.model.Student;

public class StudentDaoImpl implements StudentDao
{
	private HibernateTemplate hibernateTemplate;
	
	public StudentDaoImpl(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
		hibernateTemplate.setCheckWriteOperations(false);
	}
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public void addStudent(Student student, String adminId) {
		student.setAdminId(adminId);
		hibernateTemplate.persist(student);
	}

	public Student getStudent(String emailId) {
		Student student = hibernateTemplate.get(Student.class, emailId);
		return student;
	}

	public void deleteStudent(String emailId) {
		hibernateTemplate.bulkUpdate("DELETE Student WHERE emailId = ?", emailId);
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public void updateStudent(Student student) {
		hibernateTemplate.update(student);
	}

	public List<?> getStudentList(String adminId) {
		String query = "FROM Student WHERE adminId = ?";
		Object[] queryParam = {adminId};
		List<?> list = hibernateTemplate.find(query, queryParam);

		return list;
	}

}
