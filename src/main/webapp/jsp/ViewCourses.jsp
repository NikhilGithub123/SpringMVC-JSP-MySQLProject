<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Courses List</title>
</head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
.button {
  border: none;
  color: white;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
.home-btn{
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
.home-btn:hover{
  background-color: #45a049;

}
</style>
<body>
<table style="width:100%">
  <tr> 
    <th>Course ID</th>
    <th>Course Name</th> 
    <th>Course Description</th>
    <th>Course Fees</th>
    <th>Enroll</th>
  </tr>
  	<c:forEach items="${courseform.courses}" var="course" >
  <tr>
<td>${course.cid}</td>
<td>${course.cname}</td>
<td>${course.cdesc}</td>
<td>${course.cfees}</td>
<td><a href="enrolled/?course.cid=${course.cid}"><button class="home-btn">Enroll</button></a></td>
</tr>
	</c:forEach>

  </table>
     
   
</body>
</html>