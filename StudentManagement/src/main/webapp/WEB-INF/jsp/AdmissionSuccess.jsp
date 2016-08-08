<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="LogoutTemplate.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Success</title>
</head>
<body>
	<h3>Below student details are submitted successfully:</h3>
	<table>
			<tr>
				<td>First Name:</td>
				<td>${student.firstName}</td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td>${student.lastName}</td>
			</tr>
			<tr>
				<td>Email ID:</td>
				<td>${student.emailId}</td>
			</tr>
			<tr>
				<td>Mobile Number:</td>
				<td>${student.mobile}</td>
			</tr>
			<tr>
				<td>Address:</td>
				<td>${student.address}</td>
			</tr>
			<tr>
				<td>Skill Set:</td>
				<td>${student.skillSet}</td>
			</tr>
			<tr>
				<td>Primary Subject:</td>
				<td>${student.primarySubject}</td>
			</tr>
			<tr>
				<td>Resume:</td>
				<td>${student.resume}</td>
			</tr>
		</table>
</body>
</html>