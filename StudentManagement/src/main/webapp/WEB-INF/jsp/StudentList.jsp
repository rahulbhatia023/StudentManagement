<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="LogoutTemplate.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student List</title>
<link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.12/css/jquery.dataTables.css">
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.12/js/jquery.dataTables.js"></script>
<script>
	$(document).ready(function(){
    	$('#studentTable').DataTable();
	});
</script>
</head>
<body>
	List of Students:<br><br>
	
	<c:if test="${not empty students}">
		<table border="1" id="studentTable">
			<thead>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email ID</th>
					<th>Mobile Number</th>
					<th>Address</th>
					<th>Skill Set</th>
					<th>Primary Subject</th>
					<th>Resume</th>
				</tr>
			</thead>
			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.firstName}</td>
					<td>${student.lastName}</td>
					<td>${student.emailId}</td>
					<td>${student.mobile}</td>
					<td>${student.address}</td>
					<td>${student.skillSet}</td>
					<td>${student.primarySubject}</td>
					<td>${student.resume}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>