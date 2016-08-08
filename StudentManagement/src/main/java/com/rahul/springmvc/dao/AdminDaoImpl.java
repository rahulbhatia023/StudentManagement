package com.rahul.springmvc.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rahul.springmvc.model.Admin;
import com.rahul.springmvc.model.LoginCredentials;

public class AdminDaoImpl implements AdminDao
{
	private HibernateTemplate hibernateTemplate;
	
	public AdminDaoImpl(SessionFactory sessionFactory)
	{
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
		hibernateTemplate.setCheckWriteOperations(false);
	}
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public void createAdmin(Admin admin, LoginCredentials loginCredentials) {
		hibernateTemplate.persist(admin);
		hibernateTemplate.persist(loginCredentials);
	}

}
