package com.rahul.springmvc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class LoginDaoImpl implements LoginDao{

	private HibernateTemplate hibernateTemplate;
	
	public LoginDaoImpl(SessionFactory sessionFactory){
		hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	@Override
	public boolean authenticateUser(String userName, String password) 
	{
		String query = "FROM LoginCredentials WHERE userName = ? AND password = ?";
		Object[] queryParam = {userName, password};
		List<?> list = hibernateTemplate.find(query, queryParam);
		
		if(!list.isEmpty())
			return true;
		
		return false;
	}

}
