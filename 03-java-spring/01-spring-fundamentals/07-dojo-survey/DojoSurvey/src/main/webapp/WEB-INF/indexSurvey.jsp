<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Dojo Survey Index</title>
	<link rel="stylesheet" href="css/style.css" />
</head>
<body class="lightBlueColor">	
 <div id="formContainer">
  <div class="innerContainer">    
    <form method="post" action="/results">
       <div >Your Name: <input type="text" name="yourName"/ id = "nameFieldtSize"><c:out value="${yourName}" /></div><br>
         <div>Dojo Location:
            <select name="dojoLocation"€ id = "locationListSize"></div>
            <option>Bellevue</option>
            <option>Boise</option>
            <option>Chicago</option>
            <option>Dallas</option>
            <option>LA</option>
            <option>San Jose</option>
            <option>Online</option>
         <div></select><c:out value="${dojoLocation}" /></div><br>

         <div>Favorite Language: 
           <select name="favLanguage" id = "languageListSize"></div>
           <option>C++</option>
           <option>HTML</option>
           <option>Java</option>
           <option>JavaScript</option>
           <option>Ruby</option>
           <option>Jquery</option>
           <option>Flask</option>
           <option>React</option>
           <option>Python</option>
         <div></select><c:out value="${favLanguage}" /></div><br>
         <div>Comment (optional): </div><br>
         <div> <textarea rows="7" cols="70" name="comments" ><c:out value="${comments}"/> </textarea><br>      
         <div class="fixedInputbutton"> <input type="submit" value="Submit" class="buttonFormat"/></div>       
        
   </form>             
  </div>
 </div>  	
</body>
</html>