<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Form</title>
</head>
<body>
	<form method="POST" action="hello">
		<label for="uname">User Name</label> 
		<input type="text" name="uname" /><br>
		<input type="submit" value="Say Hello" />
	</form>

	<%-- <s:form method="POST" action="hello">
		<s:textfield label="User Name" name="uname" />
		<s:submit value="Say Hello" />
	</s:form> --%>
</body>
</html>