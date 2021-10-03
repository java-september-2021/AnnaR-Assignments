
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
  
<head> 
   <link rel="stylesheet" href="/css/style.css" /> 
   <title> New Dojo </title>
</head>    

<body>
 <div >
    <h1>New Dojo</h1>


	<div style = "margin-left: 22px">	
		  <form:form action="/dojos/new" method="post" modelAttribute="dojo">  
		    <div >
		       <form:label path="name" style="font-weight: bold"> Name: </form:label>
		       <form:input  path="name"  style="width:110px;  margin-left: 20px" />
		       <form:errors path="name"/>       
		    </div> <br> 
		    <button style=" margin-left: 120px " >Create</button>     
		  </form:form><br>	
		  <div><a href="/ninjas/new">New Ninjas</a></div> 
	 </div>
 </div>

</body>
