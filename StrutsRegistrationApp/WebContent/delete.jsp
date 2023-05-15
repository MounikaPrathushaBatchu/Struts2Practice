<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib uri="/struts-tags" prefix="s"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Form</title>
<style type="text/css">
a {
	display: block;
	text-align: center;
}

input[type=text] {
	width: 100%;
	padding: 10px 20px;
	margin: 5px 0;
	display: inline-block;
	border: 1px solid black;
	border-radius: 2px;
	box-sizxing: border-box;
}

input[type=submit] {
	width: 100%;
	background-color: green;
	color: white;
	padding: 10px 20px;
	margin: 5px 0;
	border: none;
	border-radius: 2px;
	cursor: pointer;
}

div {
	margin-bottom:10px;
}

.form-center {
	display:flex;
	justify-content:center;
}

</style>
</head>
<body>
	<h2 align="center">Syena InfoSoft</h2>
	<h3 align="center">Employee Delete Form</h3>
	
	<div class="form-center">
		<form method="POST" action="delete">
			<label for="eid">ID : </label>
			<input type="text" name="eid" /><br>
			<input type="submit" value="Delete" />
		</form>
	</div>
	<br>
	<a href="getAllEmp.jsp">Get All Employees</a>
	
	<%-- <s:form method="POST" action="delete">
		<s:textfield name="eid" label="Emp ID" />
		<s:submit value="Delete" />
	</s:form> --%>
</body>
</html>