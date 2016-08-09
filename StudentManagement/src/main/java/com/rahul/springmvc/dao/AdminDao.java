package com.rahul.springmvc.dao;

import com.rahul.springmvc.model.Admin;
import com.rahul.springmvc.model.LoginCredentials;

public interface AdminDao {
	public void createAdmin(Admin admin, LoginCredentials loginCredentials);
	public String checkEmailIdExists(String userName);
}
