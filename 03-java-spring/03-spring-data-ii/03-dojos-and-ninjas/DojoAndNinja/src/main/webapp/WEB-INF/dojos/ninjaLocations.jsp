<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 



<html>
<head>

<link rel="stylesheet" href="css/main.css" />
<title>Profile Page </title>

</head>

<h1>  <c:out value="${person.firstName}"></c:out>&nbsp;<c:out value="${person.lastName}"></c:out> </h1>

<body>
<p class = "outset">
  <c:if test="${person.license != null}">   
     <div>License Number: 000000<c:out value="${person.license.id}"></c:out></div><br>
     <div>State: <span class="textAlign"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <c:out value="${person.license.state}"></c:out> </span></div><br>
     <div>Expiration Date:&nbsp;&nbsp;<fmt:formatDate value="${person.license.expirationDate}" pattern="MM-dd-yyyy" /></div><br>  
     
  </c:if>
  
  <c:if test="${person.license == null}"> 
     <div>This person does not have a license on file. </div><br>  
  </c:if>
 </p>
  
</body>
</html>


