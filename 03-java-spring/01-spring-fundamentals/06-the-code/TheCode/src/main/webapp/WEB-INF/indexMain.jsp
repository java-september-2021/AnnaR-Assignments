<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

 <!DOCTYPE html>
 <html>
 <head>
  <meta charset="ISO-8859-1">
   <link rel="stylesheet" href="css/style.css" />
   <title> The Code</title>
 </head>  
 <body>

<div class="borderFormat">

  <form method="post" action="/process">
	<div class="fColor"><c:out value="${errorMsg}" /></div><br>
	<div class="fontSize">What is the code?</d><br>
	<input type="text" name="inputdata" /><br>
	<div  ><button class="buttonFormat">Try the Code</button></div> 		  
  </form>
   
</div>

</body>


   