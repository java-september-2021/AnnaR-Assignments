<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<html>
 <head>  
  <meta charset="ISO-8859-1">
  
  <link rel="stylesheet" type="text/css" href="css/style.css">
  <title>Language Record Dashboard</title>
</head>


<body>
<div id="outterContainer">
  <div class="tableMargin">
  <table class="columnWidth">
    <col >
	  <thead>
  	    <tr>
  	       <th>Name</th>
   		   <th>Creator</th> 
   		   <th>Version</th>
   		   <th>Action</th>
  		</tr>
 	  </thead>
 	  <tbody>
 	  <col class="columnWidth1">
  		 <c:forEach items="${ ListOfLang }" var="langs"> 
 		    <tr>
              <td><a href="/language/${langs.id}/selectedLang">${langs.lang}</a><br>
    		  <td>${langs.creator}</td>
   			  <td>${langs.version}</td>
   			  <td><a href="/language/${langs.id}/delete">delete</a>&nbsp; &nbsp;<a href="/language/${langs.id}/edit">edit</a></td>
  			</tr>
  		 </c:forEach > 
  	 </tbody>
   </table>

   </div>
 

  <form:form  action="/language/${language.id}" method="post" modelAttribute="language">  

     <div>
       <form:label path="lang"> Name: &nbsp;  </form:label>
       <form:input class="fieldFormat" path="lang"  />
       <form:errors path="lang"/>       
     </div> <br> 
     <div>
        <form:label path="creator">Creator:</form:label>
        <form:input class="fieldFormat" path="creator"/>
        <form:errors path="creator"/>       
     </div> <br>
     <div>
        <form:label path="version">Version:</form:label>
        <form:input class="fieldFormat" path="version"/> 
        <form:errors path="version"/>             
     </div> 
     <br>  
    <input type="submit" id = "buttonAlign" value="Submit"/>
  </form:form> 

</div>
</body>
</html>