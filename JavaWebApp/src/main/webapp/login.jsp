<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1 align="center">Login Form</h1>
<hr>
<form action="loginservlet" method="post">
<p style="color:red">${error}</p><br>
Username <input type="text" name="username"><br><br>
Password <input type="password" name="password"><br><br>
<input type="submit" value="Login">
<a href="index.jsp">BACK</a>
<a href="signup.jsp">SIGNUP</a>




</form>

</body>
</html>