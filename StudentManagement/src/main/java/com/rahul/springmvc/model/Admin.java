package com.rahul.springmvc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="admin_info")
public class Admin 
{
	@Column(name="first_name", nullable=false)
	@NotEmpty
	private String firstName;
	
	@Column(name="last_name", nullable=false)
	@NotEmpty
	private String lastName;
	
	@Id
	@Column(name="email_id", nullable=false)
	@NotEmpty
	@Email
	private String emailId;
	
	@Transient
	@NotEmpty
	private String password;
	
	@Column(name="birth_date", nullable=false)
	@NotNull
	private Date birthDate;
	
	@Column(name="gender", nullable=false)
	@NotEmpty
	private String gender;
	
	@Column(name="mobile", nullable=false)
	@NotEmpty
	private String mobile;
	
	@Column(name="city", nullable=false)
	@NotEmpty
	private String city;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Admin [firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", password=" + password
				+ ", birthDate=" + birthDate + ", gender=" + gender
				+ ", mobile=" + mobile + ", city=" + city + "]";
	}
}
