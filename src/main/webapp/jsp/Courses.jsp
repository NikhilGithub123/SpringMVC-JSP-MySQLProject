<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert courses here</title>
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
 <h1>COURSE FORM</h1>
 </div>
<form id="courseForm" action="courseProcess" method="post">
 <label for="cid">Course ID</label><br>
  <input type="text" id="cid" name="cid"><br>
  <label for="cname">Course Name</label><br>
  <input type="text" id="cname" name="cname"><br>
  <label for="cdesc">Course Description</label><br>
  <input type="text" id="cdesc" name="cdesc"><br>
  <label for="cfees">Course Fees</label><br>
  <input type="text" id="cfees" name="cfees"><br>
    <input type="submit" value="Submit">
</form>
</div>
</body>
</html>