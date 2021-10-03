<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
 <head>
  <meta charset="ISO-8859-1">
  <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
  <link rel="stylesheet" type="text/css" href="css/style.css">
  <title>Language Record</title>
</head>
<h3>Language Record Editor</h3>
<body>

 <div  id="outterContainer">
    <div id="editLinkContainer">
	   <a href="/language/${language.id}/delete">Delete</a>
	   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	  <a href="/language">Dashboard</a> 
	</div>


   <form:form action="/language/${language.id}" method="put" modelAttribute="language">  <br><br>

    <div>
       <form:label path="lang"> Name: &nbsp;&nbsp;&nbsp; </form:label>
       <form:input  path="lang" id = "fieldFormat" />
       <form:errors path="lang"/>       
    </div> <br> 
    <div>
        <form:label path="creator">Creator:&nbsp;&nbsp;</form:label>
        <form:input path="creator" id = "fieldFormat"/>
        <form:errors path="creator"/>       
    </div> <br>
    <div>
        <form:label path="version">Version:&nbsp;&nbsp;</form:label>
        <form:input path="version" id = "fieldFormat"/> 
        <form:errors path="version"/>             
    </div> 
    <br>  
    <input type="submit" value="Submit"/>
   </form:form> 

  </div>
</body>
</html>