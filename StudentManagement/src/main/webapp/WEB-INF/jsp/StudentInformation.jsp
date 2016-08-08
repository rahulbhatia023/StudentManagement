<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="LogoutTemplate.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Information</title>
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script>
$(document).ready(function(){
    $("#update").click(function(){
    	$("#studentForm").attr("action", "./updateStudent");
    	$("#studentForm").attr("method", "POST");
    	$("#studentForm").submit();
    });
    $("#delete").click(function(){
    	$("#studentForm").attr("action", "./deleteStudent");
    	$("#studentForm").attr("method", "POST");
    	$("#studentForm").submit();
    });
});
</script>
</head>
<body>
	<h3>Student Details:</h3>
	<form id="studentForm">
		<input type="hidden" name="studentId" value="${student.id}" />
		<table>
				<tr>
					<td>Student Id:</td>
					<td>${student.id}</td>
				</tr>
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
				<tr>
					<td><input type="button" id="update" value="Update"/></td>
					<td><input type="button" id="delete" value="Delete"/></td>
				</tr>
			</table>
		</form>
</body>
</html>