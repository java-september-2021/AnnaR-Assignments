<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  

<!DOCTYPE html>
<html>
 <head>
	  <meta charset="ISO-8859-1">
	  <link rel="stylesheet" type="text/css" href="/css/style.css">
	  <title>Search</title>
</head>
<body>

<div id="topTenBaseContainer">
   <div id = "topTenNavContainer">
      <div  id = "topTenInnerNavContainer">
      		<div class="topTenInnerTitle" >Top Ten Songs:</div> 
			<div class = "topTenDashboardLink"> <a href="/dashboard">Dashboard</a> </div> 
       </div>		
   </div>

   <div class = "topTenListContainer">   
    <table class="topTenTableWidth">
	      <col class = "columnWidth4">
		    <thead>
	  	      <tr></tr>
	 	    </thead>
	 	    <tbody>	     
	  		   <c:forEach items="${ topTentList }" var="songs"> 
	 		    <tr class = "topTenTableRowPadding">
	 		      <td> ${songs.rating}  -  </td>
	              <td class = "topTenLeftTableAlignment"><a href="/songs"> ${Song.id} ${songs.title}</a> - ${ songs.artist }</td>
	  			</tr>
	  		   </c:forEach > 
	  	     </tbody>
    </table>
  </div> 
   
</div>

</body>
</html>