<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1"> 
  <link rel="stylesheet" type="text/css" href="/css/style.css">
  <title>Question Dashboard</title>
</head>
<body>
	<div id="newContainer">
		<h1>What is your question?</h1>
		<form:form action="/" method="post" modelAttribute="NewQuestion">
			 <div >
		        <form:label class="labelFormat" path="question">Question</form:label>
		        <form:errors path="question"/>
		        <form:textarea class="fieldFormat" path="question"></form:textarea>
		    </div>
		    <div >
		        <form:label path="tags">Tags</form:label>
		        <form:errors path="tags"/>
		        <form:input class="fieldFormat2" path="tags"/>
		    </div>
		    <button class="buttonAlign">Submit</button>
		</form:form>
		<div><a class="linkAlign2" href="/"> Dashboard</a></div>
	</div>
</body>
</html>