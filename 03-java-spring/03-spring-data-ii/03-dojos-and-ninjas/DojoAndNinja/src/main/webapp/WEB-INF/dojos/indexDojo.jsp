
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
  
<head> <link rel="stylesheet" href="css/main.css" /> </head>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<title> New Dojo </title>
 
<h1>New Dojo</h1>
<body>


<form:form action="/dojos" method="post" modelAttribute="dojo">  <br><br>

    <div>
       <form:label path="name"> Name: </form:label>
       <form:input  path="name"  />
       <form:errors path="name"/>       
    </div> <br> 
     <button>Create</button>
    <br>  

   
</form:form> 

</body>
