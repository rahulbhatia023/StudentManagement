<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="LogoutTemplate.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get Student Information</title>
</head>
<body>
	<form action="./getStudentInfo" method="POST">
		<table>
			<tr>
				<td>Student Id:</td>
				<td><input type="text" name="studentId"></td>
			</tr>
			<tr>
				<td colspan=2><input type="submit" value="Get Student Info" /></td>
			</tr>
		</table>
	</form>
</body>
</html>