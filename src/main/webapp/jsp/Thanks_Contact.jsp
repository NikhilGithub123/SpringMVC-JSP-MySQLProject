<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Thanks</title>
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
.sc{
color:red;
}
</style>
<body>
<div>
<h1>Thanks <span class="sc">${name}</span> for contacting us!</h1>
</div>
<div>
<a href="home.jsp"><button style= " background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;">Home</button></a>
</div>
</body>
</html>