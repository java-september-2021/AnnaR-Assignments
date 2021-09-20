<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
   <meta charset="ISO-8859-1">
   <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
   <link rel="stylesheet" type="text/css" href="css/style.css">     
   <title>Current visit count </title>
</head>
<body class = "lightGreenColor">


 <div class = "borderFormat">
 <table style="width:80%"  >
  <tr>  <th> </th> </tr> 
  <tr>
    <td width="300px" > 
       <p> You have visited the Welcome page <a href="/">http://localhost:8080</a> <c:out value="${access}" /> times. </p>
       <p> <a href="/reset"><button class = "buttonFormat"> Reset Counter</button></a>     
    </td>
  </tr> 
 </table>	
 </div>
 
 
</body>
</html>