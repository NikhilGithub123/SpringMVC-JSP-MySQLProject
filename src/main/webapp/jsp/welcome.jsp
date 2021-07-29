<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<style>
.button{
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  }

</style>
<body>
<div>
<h1>Congratulations!</h1>
<h3>Welcome ${name} to our portal</h3>
</div>
<div>
<h3>Kindly login to continue:</h3>
<a href="login"><button>Login</button></a>
</div>
</body>
</html>