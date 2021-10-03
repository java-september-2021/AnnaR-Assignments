<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="/css/style.css" /> 

    <title> Dojo Page </title>
  

</head>
<body>

  <div  style="margin-left: 70px">
	<h1>${ Dojo.name } Location Ninjas </h1>
	
	<table style="width:550px">
	    <col class="columnWidth">
	    <thead>
		  <tr>
		    <th>First Name</th>
		    <th>Last Name</th> 
		    <th >Age</th>
		  </tr>
		  </thead>
		  <tbody>
		  <col class="columnWidth">
		  <c:forEach items="${ Dojo.ninjas }" var="ninja">	  
			  <tr>
			    <td>${ninja.firstName} </td>
			    <td> ${ninja.lastName}</td>
			    <td class="cellPadding">${ninja.age}</td>
			  </tr>
		  </c:forEach > 	
	  </tbody>
	</table>
	
	
   <br>
	
   <div><a href="/ninjas/new">Ninja</a></div>
	<div><a href="/dojos/new">Dojo</a></div>
  </div>

</body>
</html>