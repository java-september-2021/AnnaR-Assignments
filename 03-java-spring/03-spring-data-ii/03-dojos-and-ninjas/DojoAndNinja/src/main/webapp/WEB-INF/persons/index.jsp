
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
  
<head> <link rel="stylesheet" href="css/main.css" /> </head>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

 
<h1>New Person</h1>
<body>


<form:form action="/persons" method="post" modelAttribute="person">  <br><br>

    <div>
       <form:label path="firstName"> First Name: &nbsp; </form:label>
       <form:input  path="firstName"  />
       <form:errors path="firstName"/>       
    </div> <br> 
    <div>
       <form:label path="lastName"> Last Name: &nbsp; </form:label>
       <form:input  path="lastName"  />
       <form:errors path="lastName"/>       
    </div> <br> 
     <button>Create</button>
    <br>  

   
</form:form> 

</body>
