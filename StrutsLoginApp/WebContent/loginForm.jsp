<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
</head>
<body>
	<h3>Syena Infosoft</h3>
	<h4>User Login Page</h4>
	<font color="red" size="5"> 
		<b> 
			<s:property value="errorMsg" />
		</b>
	</font>

	<s:form methos="POST" action="login">
		<s:textfield name="uname" label="User Name" />
		<s:password name="upwd" label="Password" />
		<s:submit value="Login" />
	</s:form>
</body>
</html>