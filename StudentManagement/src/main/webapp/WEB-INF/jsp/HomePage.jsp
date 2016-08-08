<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script>
$(document).ready(function(){
    $("#signIn").click(function(){
    	$("#homePageForm").attr("action", "./signIn");
    	$("#homePageForm").attr("method", "POST");
    	$("#homePageForm").submit();
    });
    $("#signUp").click(function(){
    	$("#homePageForm").attr("action", "./signUp");
    	$("#homePageForm").attr("method", "POST");
    	$("#homePageForm").submit();
    });
});
</script>
</head>
<body>
	<h1 align="center">Welcome to the Student Management System</h1>
	<form id="homePageForm">
		<table align="center">
			<tr>
				<td><input type="button" id="signIn" value="Sign In"/></td>
				<td><input type="button" id="signUp" value="Sign Up"/></td>
			</tr>
		</table>
	</form>
</body>
</html>