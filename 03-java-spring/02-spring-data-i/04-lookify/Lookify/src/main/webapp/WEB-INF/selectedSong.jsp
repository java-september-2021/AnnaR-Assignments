<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
 <head>
	  <meta charset="ISO-8859-1">
	  <link rel="stylesheet" type="text/css" href="/css/style.css">
	  <title>Details</title>
</head>
<body>
  <div id = "addSongBaseContainer">
  	
	    <div class = "dashboardContainter"> <a href="/dashboard">Dashboard</a><br> </div>  
			
		<div class = "contentContainer">
		   <div>Title:  <span class = "selectedSongFieldAlignment1"> <c:out value="${Song.title}"></c:out></span></div><br><br>
		   <div>Artist: <span class = "selectedSongFieldAlignment2">  <c:out value="${Song.artist}"></c:out> </span></div><br><br>
		   <div>Rating (1-10): <span class = "selectedSongFieldAlignment3"> <c:out value="${Song.rating}"></c:out> </span></div><br><br>
		  
		
		   <div> <a href="/songs/{id}/delete">Delete</a><br> </div> 
		</div> 
  </div> 
</body>
</html>