<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <!DOCTYPE html>
<html>
  
 <head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="/css/style.css">
		<title class = "leftAlign">New License Form </title>
 </head>   
 
<body>
 <div style="margin-left: 70px">
<h1>New License</h1>


	<form:form action="/licenses" method="post" modelAttribute="license">  <br>
	 <div >
	   <form:label  path="person">Person:</form:label>
	   <form:errors path="person"/>
	   <form:select class="fieldSpace1" path="person">
	     <c:forEach items="${ persons }" var="person">
	 	 <form:option value="${ person.id }">${ person.firstName }&ensp; ${person.lastName }</form:option>
	     </c:forEach>
	   </form:select>
	 </div><br>
	 <div>
	   <form:label  path="state">State: </form:label>
	   <form:errors path="state"/>
	   <form:input  class="fieldSpace2" path="state"/>
	 </div><br>
	 <div>
	   <form:label  path="expirationDate">Expiration Date: </form:label>
	   <form:errors path="expirationDate"/>
	   <form:input class="fieldSpace3" type="Date" path="expirationDate"  name = "expirationDate"   /> 
	 </div><br>
	
	   <button class="fieldSpace4"  type = "Submit" >Create </button>
	 </form:form>
</div>

</body>
</html>
