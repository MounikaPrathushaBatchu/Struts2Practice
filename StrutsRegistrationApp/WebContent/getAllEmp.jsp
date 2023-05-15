<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@taglib uri="/struts-tags" prefix="s"%> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get all Employees Page</title>
<style type="text/css">
table {
	border-collapse: collapse;
}

th, td {
	padding: 10px;
}

tfoot {
	text-align: left;
}

a {
	display: block;
	text-align: center;
}
</style>
</head>
<body>
	<h2 align="center">Syena InfoSoft</h2>
	<h4 align="center">All Employees Data</h4>

	<table border="1" align="center">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Mobile</th>
		</tr>
		<c:forEach items="${list}" var="s">
			<tr>
				<td>${s.eid}</td>
				<td>${s.ename}</td>
				<td>${s.eemail}</td>
				<td>${s.emobile}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>