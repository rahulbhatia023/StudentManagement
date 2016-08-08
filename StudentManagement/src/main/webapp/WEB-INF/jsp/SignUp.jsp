<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springForm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.0/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
<script>
  $(function(){
    $("#birthDate").datepicker();
  } );
</script>
</head>
<body>
	<h2>Please fill the below details to create an account:</h2>
	
	<form action="./signUpAdmin" method="POST">
		<table>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName" value="${admin.firstName}"/></td>
				<td><springForm:errors path="admin.firstName" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName" value="${admin.lastName}"/></td>
				<td><springForm:errors path="admin.lastName" /></td>
			</tr>
			<tr>
				<td>Email ID:</td>
				<td><input type="text" name="emailId" value="${admin.emailId}"/></td>
				<td><springForm:errors path="admin.emailId" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" value="${admin.password}"/></td>
				<td><springForm:errors path="admin.password" /></td>
			</tr>
			<tr>
				<td>Birth Date:</td>
				<td><input type="text" name="birthDate" id="birthDate" /></td>
				<td><springForm:errors path="admin.birthDate" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td>
					<select name="gender">
						<option value="Male">Male</option>
						<option value="Female">Female</option>
						<option value="Other">Other</option>
					</select>
				</td>
				<td><springForm:errors path="admin.gender" /></td>
			</tr>
			<tr>
				<td>Mobile Phone:</td>
				<td><input type="text" name="mobile" value="${admin.mobile}"/></td>
				<td><springForm:errors path="admin.mobile" /></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><input type="text" name="city" value="${admin.city}"/></td>
				<td><springForm:errors path="admin.city" /></td>
			</tr>
			<tr>
				<td colspan=2 align="center"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>