<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome page</title>
</head>
<body>
	<s:if test="sm != null">
		<font color="green"> <s:property value="sm" />
		</font>
	</s:if>
	<s:if test="em != null">
		<font color="red"> <s:property value="em" />
		</font>
	</s:if>

	<h1>Insert Product</h1>
	<s:form action="saveProd" method="POST">
		<s:textfield name="eid" label="ID" />
		<s:textfield name="ename" label="Name" />
		<s:textfield name="eemail" label="Email" />
		<s:textfield name="emobile" label="Mobile" />
		<s:submit value="save" />
		
	</s:form>
	<br>
	<a href="listPage">List OF Employees</a>
</body>
</html>