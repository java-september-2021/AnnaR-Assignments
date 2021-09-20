<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.io.*,java.sql.*, java.util.*"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

 <!DOCTYPE html>
 <html>
 <head>
   <meta charset="UTF-8" >
   <title> Welcome Page </title>
 </head>  
 <body> 
 <h1></h1>
 <h2></h2>
<br><br><br>

<%  
try{
Integer hitsCount =(Integer)application.getAttribute("hitCounter");
		        if( hitsCount ==null || hitsCount == 0 )
		         {  hitsCount = 1; }
		        else
		         {  hitsCount += 1;}
		   application.setAttribute("hitCounter", hitsCount);  
}	
catch (Exception e) { 
	out.println(e.toString());
}	       
%> 

<h3> You have visited the Welcome page <%= hitsCount%> times. </h3>

</body>
</html

   