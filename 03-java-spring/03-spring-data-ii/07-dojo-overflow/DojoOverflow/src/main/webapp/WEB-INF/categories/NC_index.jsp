
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
  
<head>
  <meta charset="ISO-8859-1"> 
  <link rel="stylesheet" href="/css/main.css" /> 
  <title> New Category </title>
</head>   


<body>

  <h1>New Category</h1>
  <table style="width:50%" class="outset" style= "background-color:#F0F8FF;">
	  <thead> </thead>
	  <tbody>
	   <tr >
	 	 <td>
			<form:form action="/categories" method="post" modelAttribute="category">  <br><br>
			    <div>
			       <form:label path="name"> Name: </form:label>
			       <form:input  path="name"  />
			       <form:errors path="name"/>       
			    </div> <br> 
			    <div class = "buttonAlign2"><button>Create</button></div>     
			</form:form>
		  </td>
	   </tr>
	  </tbody>
  </table><br><br>
<div><a href="/products">New Product</a></div> 



</body>
