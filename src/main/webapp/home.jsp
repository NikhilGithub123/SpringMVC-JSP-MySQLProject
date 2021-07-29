<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<style>
.home-btn{
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  font-size: 25px;
}
.home-btns{
margin: 0 auto;
    width: 25%;
    display: flex;
    justify-content: space-evenly;
}

</style>
 <body style="background: #f2f2f2">
 <div style="text-align: center;margin-bottom: 130px;">
 <h1> WELCOME TO AMDOCS PORTAL</h1>
 <h3> Please select the option according to your role</h3>
 </div>
 <div>
 <div class="home-btns">
 <a href="admin"><button class="home-btn">Admin</button></a>
<a href="user"><button class="home-btn">User</button></a>
</div>
</div>
</body>
</html>