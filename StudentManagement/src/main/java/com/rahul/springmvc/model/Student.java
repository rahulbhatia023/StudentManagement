package com.rahul.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_info")
public class Student 
{
	@Column(name="admin_id", nullable=false)
	private String adminId;
	
	@Column(name="first_name", nullable=false)
	private String firstName;
	
	@Column(name="last_name", nullable=false)
	private String lastName;
	
	@Id
	@Column(name="email_id", nullable=false)
	private String emailId;
	
	@Column(name="mobile", nullable=false)
	private String mobile;
	
	@Column(name="address", nullable=false)
	private String address;
	
	@Column(name="skill_set", nullable=false)
	private String skillSet;
	
	@Column(name="primary_subject", nullable=false)
	private String primarySubject;
	
	@Column(name="_resume")
	private String resume;

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public String getPrimarySubject() {
		return primarySubject;
	}

	public void setPrimarySubject(String primarySubject) {
		this.primarySubject = primarySubject;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	@Override
	public String toString() {
		return "Student [adminId=" + adminId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", emailId=" + emailId
				+ ", mobile=" + mobile + ", address=" + address + ", skillSet="
				+ skillSet + ", primarySubject=" + primarySubject + ", resume="
				+ resume + "]";
	}
}
