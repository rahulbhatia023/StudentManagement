<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="LogoutTemplate.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Student</title>
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://malsup.github.com/jquery.form.js"></script>
<script>
	function uploadFile() 
	{
		var formData = new FormData();
		formData.append("file", resume.files[0]);

		$.ajax({
			url : './uploadFile', 		// Specifies the URL to send the request to. Default is the current page.
			data : formData,			// Specifies data to be sent to the server.
			processData : false,		// A Boolean value specifying whether or not data sent with the request should be transformed into a query string. Default is true.
			contentType: false,			// The content type used when sending data to the server. Default is: "application/x-www-form-urlencoded"
			type : 'POST',				// Specifies the type of request. (GET or POST)
			success : function(data) {	// A function to be run when the request succeeds
				$('#uploadMessage').html(data);
			}
		});
	}
</script>
</head>
<body>
	<h2>Update Student Information:</h2>
	<form action="./updateStudentInfo" method="POST">
		<table>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName" value="${student.firstName}" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName" value="${student.lastName}"/></td>
			</tr>
			<tr>
				<td>Email ID:</td>
				<td><input type="hidden" name="id" value="${student.emailId}" /><input type="text" name="emailId" value="${student.emailId}"/></td>
			</tr>
			<tr>
				<td>Mobile Number:</td>
				<td><input type="text" name="mobile" value="${student.mobile}"/></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><input type="text" name="address" value="${student.address}"/></td>
			</tr>
			<tr>
				<td>Skill Set:</td>
				<td><input type="text" name="skillSet" value="${student.skillSet}"/></td>
			</tr>
			<tr>
				<td>Primary Subject:</td>
				<td><input type="text" name="primarySubject" value="${student.primarySubject}"/></td>
			</tr>
			<tr>
				<td>Resume:</td>
				<td><input type="file" name="resume" id="resume" value="${student.resume}"/><input type="button" value="Upload" onclick="uploadFile()"><div id="uploadMessage"></div></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Update" /></td>
			</tr>
		</table>
	</form>
</body>
</html>