<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <title>Registration Page</title>
</head>
<body>
 <div id="outterContainer">
    <h1>Register!</h1>
    <div id="outterContainer2">
    <p><form:errors path="user.*"/></p>
    
	    <form:form method="POST" action="/registration" modelAttribute="user">
	        <p >
	            <form:label path="email">Email:</form:label>
	            <form:input class="fieldFormat" type="email" path="email"/>
	        </p>
	        <p >
	            <form:label path="password">Password:</form:label>
	            <form:password class="fieldFormat2" path="password"/>
	        </p>
	        <p >
	            <form:label path="passwordConfirmation">Password Confirmation:</form:label>
	            <form:password class="fieldFormat3" path="passwordConfirmation"/>
	        </p>
	        <input class="buttonAlign" type="submit" value="Register!"/>
	    </form:form>
    </div> 
 </div>   
</body>
</html>