<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1"> 
  <link rel="stylesheet" type="text/css" href="/css/style.css">
  <title>Question Profile</title>
</head>
<body>
	<div id="outterContainer2">
	  <div id="innerContainer">
		<div class="leftMargin">${ question.question }</div>
		<div id="outterTagContainer">
			<div id="innerTagContainer">Tags:</div>
			<div id="innerTagContainer2">
				<ul>
					<c:forEach items="${ question.tags }" var="tag">
						<li><button  class="tagButton">${ tag.subject }</button></li>
					</c:forEach>
				</ul>
			</div>
		</div>
	
		<div id="tableContainer2">
			<table class="columnWidth">
	          <col >
				<thead class="theadBkgrd">
			  	    <tr> <th>Answers</th></tr>
		 	    </thead>
		 	    <tbody>
						<c:forEach items="${ question.answers }" var="answer">
			 	           <tr><td>${ answer.answer }</td></tr>  			
						</c:forEach>
		  	    </tbody>
	        </table> 
	        
	        </div>
        </div>		
		
                                           
		<div id="innerContainer">
			<div class="answerHeading">Add your answer:</div>
			<form:form action="/answers" method="post" modelAttribute="newAnswer">
				 <div >
			        <form:label class="answerLabel" path="answer">Answer</form:label>
			        <form:errors path="answer"/>
			        <form:textarea class="fieldFormat3" path="answer"></form:textarea>
			    </div>
			    <form:hidden path="question" value="${ question.id }"/>
			    <button class="answerButton">Answer it!</button>
			</form:form>
		</div>
		
	</div>
	<div><a class="linkAlign3" href="/"> Dashboard</a></div>
</body>
</html>