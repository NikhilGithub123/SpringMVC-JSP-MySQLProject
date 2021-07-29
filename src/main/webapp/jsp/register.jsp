<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Here!</title>
</head>
<style>
input[type=text],input[type=email],input[type=password],input[type=number], select {
  width: 35%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 35%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  text-align: center;
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
  font-size: 20px;	
}
</style>
 <body>
 <div>
 <div>
 <h1>REGISTRATION FORM</h1>
 </div>
 <form id="regForm" action="registerProcess" method="post">
   <label for="uid">User ID</label><br>
  <input type="text" id="uid" name="uid" required><br>
  <label for="name">Name</label><br>
  <input type="text" id="name" name="name" required><br>
  <label for="email">Email</label><br>
  <input type="email" id="email" name="email" required><br>
  <label for="pwd">Password</label><br>
<input type="password" id="pwd" name="pwd" required><br>
  <label for="phone">Phone</label><br>
  <input type="number" id="phone" name="phone" required><br>
    <label for="address">Address</label><br>
  <input type="text" id="address" name="address" required><br>
    <input type="submit" value="Submit">
 </form>
 </div>
        </body>
</html>