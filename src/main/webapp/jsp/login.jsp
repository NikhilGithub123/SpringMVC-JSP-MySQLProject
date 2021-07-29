<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Here!</title>
</head>
<style>
<style>
input[type=text],input[type=password] {
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
</style>
<body>
<div>
 <div>
 <h1>LOGIN FORM</h1>
 </div>
  <table style="text-align:center; margin: 0 auto">
     <tr>
         <td style="font-style: italic; color: red;">${message}</td>
     </tr>
 </table>
<form id="loginForm" action="loginProcess" method="post">
 	<label for="username">Username</label><br>
  	<input type="text" id="username" name="username" required style="
    width: 35%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
"><br>
  	<label for="pwd">Password</label><br>
	<input type="password" id="pwd" name="pwd" required style="
    width: 35%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
"><br>
    <input type="submit" value="Submit">
</form>
</div>

</body>
</html>