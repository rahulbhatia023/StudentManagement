package com.rahul.springmvc.dao;

public interface LoginDao 
{
	public boolean authenticateUser(String userName, String password);
}
