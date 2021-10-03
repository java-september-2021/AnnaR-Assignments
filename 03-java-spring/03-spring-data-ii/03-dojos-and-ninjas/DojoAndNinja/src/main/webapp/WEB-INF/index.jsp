<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
  
<head> <link rel="stylesheet" href="css/main.css" /> </head>


<h1>Languages</h1>
<body>
<table style="width:50%">
 <col class="columnWidth">
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
    <td><a href="/language/${langs.id}">delete</a>&nbsp; &nbsp;<a href="/language/${langs.id}/edit">edit</a></td>
  </tr>
  </c:forEach > 
  </tbody>
</table>

<br><br> 



<form:form  action="/language/${language.id}" method="post" modelAttribute="language">  

    <div>
       <form:label path="lang"> Name &nbsp; </form:label>
       <form:input id = "fieldFormat" path="lang"/>
       <form:errors path="lang"/>       
    </div> <br> 
    <div>
        <form:label path="creator">Creator</form:label>
        <form:input id = "fieldFormat" path="creator"/>
        <form:errors path="creator"/>       
    </div> <br>
    <div>
        <form:label path="version">Version</form:label>
        <form:input id = "fieldFormat" path="version"/> 
        <form:errors path="version"/>             
    </div> 
    <br>  
    <input type="submit" id = "buttonAlign" value="Submit"/>
</form:form> 

<form id="delete-form" action="/language/${language.id}" method="post">
		    <input type="hidden" name="_method" value="delete">
		    <input class="btn btn-danger" type="submit" value="Delete">
		</form>
</body>
