package com.rahul.springmvc.dao;

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
	public void addStudent(Student student) {
		hibernateTemplate.persist(student);
	}

	public Student getStudent(int id) {
		Student student = hibernateTemplate.get(Student.class, id);
		return student;
	}

	public void deleteStudent(int id) {
		hibernateTemplate.bulkUpdate("DELETE Student WHERE id = ?", id);
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public void updateStudent(Student student) {
		hibernateTemplate.update(student);
	}

}
