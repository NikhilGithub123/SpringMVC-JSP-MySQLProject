<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin View</title>
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
  font-size: 20px;
}
.home-btn:hover{
  background-color: #45a049;

}
.user_view{
display: flex;
justify-content: space-evenly;
}
</style>
<body style="background: whitesmoke">
<div>
<h1 style="text-align: center; margin-bottom: 100px;">ADMIN PORTAL</h1>
<div class="user_view">
<a href="Courses"><button class="home-btn">Add Courses</button></a>
<a href="ViewFeedbacks"><button class="home-btn">View Feedbacks</button></a>
<a href="ViewContacts"><button class="home-btn">View Contacts</button></a>
</div>
</div>
</body>
</html>