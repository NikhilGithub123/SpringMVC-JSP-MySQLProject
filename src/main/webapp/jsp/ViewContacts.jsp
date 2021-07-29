<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
</style>
<body>
<table style="width:100%">
  <tr> 
    <th>User ID</th>
    <th>User Name</th> 
    <th>User Email</th>
    <th>Phone No.</th>
    <th>Message</th>
  </tr>
  	<c:forEach items="${contactform.contacts}" var="contact" >
  <tr>
<td>${contact.uid}</td>
<td>${contact.name}</td>
<td>${contact.email}</td>
<td>${contact.phone}</td>
<td>${contact.message}</td>
</tr>
	</c:forEach>

  </table>
     
   
</body>
</html>