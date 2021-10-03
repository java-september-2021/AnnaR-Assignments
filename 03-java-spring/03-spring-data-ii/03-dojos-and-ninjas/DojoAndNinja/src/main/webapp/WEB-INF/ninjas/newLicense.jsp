<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <!DOCTYPE html>
<html>
  
<head> 
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/main.css" /> 
</head>   
 
<title class = "leftAlign">New License Form </title>
 
<h1>New License</h1>
<body>

<form:form action="/licenses" method="post" modelAttribute="license">  <br>
 <div class = "leftAlign">
   <form:label  path="person">Person:</form:label>
   <form:errors path="person"/>
   <form:select path="person">
     <c:forEach items="${ persons }" var="person">
 	 <form:option value="${ person.id }">${ person.firstName } ${person.lastName }</form:option>
     </c:forEach>
   </form:select>
 </div><br>
 <div id = "leftAlign">
   <form:label  path="state">State: </form:label>
   <form:errors path="state"/>
   <form:input  path="state"/>
 </div><br>
 <div class = "leftAlign">
   <form:label  path="expirationDate">Expiration Date: </form:label>
   <form:errors path="expirationDate"/>
   <form:input type="Date" path="expirationDate"  name = "expirationDate"   /> 
 </div><br>

   <button class = "leftAlign" type = "Submit" >Create </button>
 </form:form>


</body>
</html>
