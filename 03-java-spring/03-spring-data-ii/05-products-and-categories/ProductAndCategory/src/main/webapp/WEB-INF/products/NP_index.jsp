
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
  
<head> <link rel="stylesheet" href="/css/main.css" /> </head>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<title> New Product </title>
 
<h1>New Product</h1>
<body>
<table style="width:50%" class="outset" style= "background-color:#F0F8FF;">

  <tr >
<td>

<form:form action="/products" method="post" modelAttribute="product">  <br><br>
    <div class = "fieldAlign">
       <form:label  path="name">&emsp;&emsp; Name: </form:label>
       <form:input  path="name"  />
       <form:errors path="name"/>       
    </div> <br> 
    <div class = "fieldAlign2">
       <form:label path="description"> Description: </form:label>
       <form:textarea  path="description"  />
       <form:errors path="description"/>       
    </div> <br>
    <div class = "fieldAlign3">
       <form:label path="price">&emsp;&emsp;Price:  </form:label>
       <form:input  path="price"  />
       <form:errors path="price"/>       
    </div> <br>
    <div class = "fieldAlign4"><button>Create</button></div>     
</form:form>

</td>
</tr>
</table><br><br>
<div><a href="/categories/new">New Category</a></div> 



</body>
