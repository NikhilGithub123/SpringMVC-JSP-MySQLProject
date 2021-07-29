<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Portal</title>
</head>
<style>
.home-btn{
padding: 20px 30px;
    font-size: 25px;
    cursor: pointer;
}
.user_div{
display: flex;
    justify-content: space-evenly;
}
</style>
<body style="
    background: lightseagreen;">
<div style="text-align: center;margin-bottom: 130px;">
<h1>USER PORTAL</h1>
</div>
<div class="user_div">
<div style="text-align: center">
<h3>If you are new to this portal click here:</h3>
<a href="register"><button class="home-btn">Register</button></a>
</div>
<div style="text-align: center">
<h3>If you are a registered user click here:</h3>
<a href="login"><button class="home-btn">Login</button></a>
</div>
</div>
</body>
</html>