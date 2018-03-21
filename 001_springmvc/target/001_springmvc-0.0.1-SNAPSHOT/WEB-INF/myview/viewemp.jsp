<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Designation</th>
		</tr>
		<c:forEach var="FirstSpringMVC" items="${list}">
			<tr>
				<td>${FirstSpringMVC.id}</td>
				<td>${FirstSpringMVC.name}</td>
				<td>${FirstSpringMVC.salary}</td>
				<td>${FirstSpringMVC.designation}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>