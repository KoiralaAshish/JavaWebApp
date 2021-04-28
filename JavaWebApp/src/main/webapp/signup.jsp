<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
</head>
<body>
<h1 align="center">Signup Form</h1>
<hr>
<form action="signupservlet" method="post">

Username <input type="text" name="username"><br><br>
Password <input type="password" name="password"><br><br>
<input type="submit" value="Signup">
<a href="index.jsp">BACK</a>
<a href="login.jsp">LOGIN</a>




</form>

</body>
</html>