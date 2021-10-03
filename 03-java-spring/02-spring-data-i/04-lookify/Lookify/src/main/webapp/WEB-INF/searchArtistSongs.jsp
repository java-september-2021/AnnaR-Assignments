<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <link rel="stylesheet" type="text/css" href="css/style.css">
  <title>Search</title>
</head>

<body>

<div class="artistBaseContainer"> 
    <div id = "artistTopDashboard">
      <div  id = "innerArtistTopDashboard">
            <div>Songs by artist  ${ Artist }  </div>        
      		<div>
		       <form  action="/search" method="get">  
		          <input class = "artistSearchFieldWidth" name="artist"/>          
		          <input id ="artistSearchButton" type="submit" value="Search Artists"/>
		       </form>  
      		</div>
      		<div class = "artistDashboardLink"> <a href="/dashboard">Dashboard</a></div>
       </div>		
    </div> 
  

   <div id="gridContainerDashboard">   
     <table class="dashboardTableWidth">
      <col >
	   <thead>
  	     <tr>
   		   <th>Name</th>   	     
   		   <th>Rating</th> 
   		   <th>Actions</th>
  		</tr>
 	   </thead>
 	   <tbody>
 	   <col class="columnWidth1">
  		 <c:forEach items= "${ artistList }" var="Song"> 
 		    <tr>
              <td><a href="/songs/${Song.id}"> ${Song.title}</a><br>
    		  <td class="dashboardCellPadding">${Song.rating}</td>
   			  <td class="dashboardCellPadding2"><a href="/songs/${Song.id}/delete">delete</a></td>
  			</tr>
  		 </c:forEach > 
  	   </tbody>
     </table>   

  </div> 
   
</div>

</body>
</html>