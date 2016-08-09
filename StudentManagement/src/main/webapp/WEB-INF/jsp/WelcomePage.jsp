<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<%@ include file="LogoutTemplate.jsp" %>
	Hello ${userName}
	<br>
	<br><a href="./addStudent">Add Student</a>
	<br><a href="./getStudentByEmailId">Get Student By Email ID</a>
	<br><a href="./getStudentList">Get Student List</a>
</body>
</html>