<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Form</title>
</head>
<body>
	<h3>Syena InfoSoft</h3>
	<h4>Employee Delete Form</h4>
	<s:form method="POST" action="delete">
		<s:textfield name="eid" label="Emp ID" />
		<s:submit value="Delete" />
	</s:form>
</body>
</html>