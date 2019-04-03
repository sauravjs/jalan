<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Unable to register.Please try again</h1>
<form action="RegisterController">
<table>
<tr>
<td><label>NAME</label></td>
<td><input type="text" name="name"/></td>
</tr>

<tr>
<td><label>CITY</label></td>
<td><input type="text" name="city"/></td>
</tr>

<tr>
<td><label>PASSWORD</label></td>
<td><input type="password" name="pwd"/></td>
</tr>

<tr>
<td><input type="submit"  value="REGISTER"/></td>
</tr>
</table>
</form>
</body>
</html>