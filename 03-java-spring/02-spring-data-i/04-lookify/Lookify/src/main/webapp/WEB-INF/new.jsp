<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
  
<!DOCTYPE html>
<html>
 <head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="/css/style.css">
		<title>Add Song</title>
 </head>
<body>
 
   <div id = "addSongBaseContainer">
  	
	   <div class = "addSongDashboardContainter"> <a href="/dashboard">Dashboard</a><br> </div>  
       <div class = "addSongFormContainer">

		  <form:form  action="/songs/new" method="post" modelAttribute="Song">  
		
		     <div class = "addSongFieldBottomSpacing">
		       <form:label path="title"> Title: &nbsp;  </form:label>
		       <form:input class = "addSongFieldAlignment1"  path="title" />
		       <form:errors path="title"/>       
		     </div> <br> 
		     <div class = "addSongFieldBottomSpacing">
		        <form:label path="artist">Artist:</form:label>
		        <form:input  class = "addSongFieldAlignment1"  path="artist"   />
		        <form:errors path="artist"/>       
		     </div> <br>
		     <div class = "addSongFieldBottomSpacing">
		        <form:label path="rating">Rating (1-10):</form:label>
		       
		        <form:select class = "addSongFieldAlignment2" path="rating">
		        <c:forEach items="${ratingList}" var = "i" >		          		        
					<form:option value="${i}" > ${i}</form:option>
				</c:forEach>
				</form:select>
		        <form:errors path="rating"/>             
		     </div> 
		     <br>  
		     <input class = "addSongButtonSpacing" type="submit" id = "buttonAlign" value="Add Song"/>
		 </form:form> 
		</div>
  </div>
</body>
</html>