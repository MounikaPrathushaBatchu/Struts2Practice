<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List page</title>
<style type="text/css">
table {
	border-collapse: collapse;
}

th, td {
	padding: 10px;
}

tfoot {
	text-align: left
}
</style>
</head>
<body>
	<table border="1" align="left">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Mobile</th>
				<th colspan="2">Action</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="productList">
				<tr>
					<td><s:property value="eid" /></td>
					<td><s:property value="ename" /></td>
					<td><s:property value="eemail" /></td>
					<td><s:property value="emobile" /></td>
					<td><a href="editEmp?eid=<s:property value="eid" />">Edit</a></td>
					<td><a href="deleteEmp?eid=<s:property value="eid" />">Delete</a></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>