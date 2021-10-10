<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  

<!DOCTYPE html>
<html>
 <head>  
  <meta charset="ISO-8859-1"> 
  <link rel="stylesheet" type="text/css" href="css/style.css">
  <title>Question Dashboard</title>
</head>

<body>

<div id="outterContainer">
  <div class="tableMargin">
  <h1>Questions Dashboard</h1>
  
  <table class="columnWidth">
    <col >
	  <thead class="theadBkgrd">
  	    <tr>
  	       <th>Question</th>
   		   <th>Tags</th> 
  		</tr>
 	  </thead>
 	  <tbody>
 	  <col class="columnWidth1" >
  		 <c:forEach items="${ ListOfQuestions }" var="quest"> 
 		    <tr >
              <td><a href="/${quest.id}">${quest.question}</a><br>
   			  <td>
				<c:forEach items="${ quest.tags }" var="tag">
					<span>
					${ tag.subject }	<c:if test="${ tag.subject.length() != null}"> </c:if></span>
				</c:forEach>
			 </td>   			 
  			</tr>
  		 </c:forEach > 
  	 </tbody>
   </table> 
  
   </div>
     <table id="noBorder">
    <col >
	  <thead>
  	    <tr>
  	     <td>   </td>
  	      <td> <a class="linkAlign" href="/new">New Question</a>  </td>
  		</tr>
 	  </thead>
 	  <tbody>
 			<tr><td><a class="linkAlign" href="/new"></a> </tr></td>
  	 </tbody>
   </table> 

</div>



</body>
</html>