<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <!DOCTYPE html>
<html>

 <head> 
   <meta charset="ISO-8859-1">
   <link rel="stylesheet" href="/css/style.css" /> 
   <title> New Ninja </title>
</head> 

<body>
	<div class = "ninjaFormMargin" >
	<h1 class = "ninjaHeading">New Ninja</h1>	
		<form:form action="/ninjas" method="post" modelAttribute="ninja">  
			 <div >
				   <form:label  path="dojo">Dojo:</form:label>
				   <form:errors path="dojo"/>
				   <form:select class = "ninjaDropListSpacer" path="dojo">
				     <c:forEach items="${ dojos }" var="dj">
				 	 <form:option value="${ dj.id }">${ dj.name }</form:option>
				     </c:forEach>
				   </form:select>
			 </div><br>
			 <div >
				   <form:label  path="firstName">First Name: </form:label>
				   <form:errors path="firstName"/>
				   <form:input  class = "ninjaFieldSpacer" path="firstName"/>
			 </div><br>
			  <div >
				   <form:label  path="lastName">Last Name: </form:label>
				   <form:errors path="lastName"/>
				   <form:input  class = "ninjaFieldSpacer" path="lastName"/>
			 </div><br>
			 <div >
				   <form:label  path="age">Age: </form:label>
				   <form:errors path="age"/>
				   <form:input  class = "ninjaAgeFieldSpacer" path="age"/> 
			 </div><br>
			
			   <button  class = "ninjaButtonSpacer" type = "Submit" >Create </button>
		 </form:form><br><br>
	
	  <div><a href="/dojos/new">New Dojos</a></div>	
	</div>
</body>
</html>
