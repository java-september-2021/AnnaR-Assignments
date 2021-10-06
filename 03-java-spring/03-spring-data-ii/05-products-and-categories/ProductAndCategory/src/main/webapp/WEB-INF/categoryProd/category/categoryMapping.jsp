
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
  
<head> <link rel="stylesheet" href="/css/main2.css" /> </head>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 



<title> Category Mapping </title>
 

<body>

<table style="width:40%" >
<thead>
<tr >
   <th colspan="2" style="font-size:30px">Category Mapping</th> 
</tr>
</thead>
 <tbody> 
 <tr> 
 <col class="columnWidth1">
 <table style="width:40%" >
  <td style="font-size:30px">
  <table >
  <tbody> 
    Categories 
    <c:forEach items="${ ListOfCat }" var="cat"> 
     <tr>
       <td><ul><li><a href="/products/${cat.id}">${cat.name}</a></li></ul></td><br>
     </tr>
    </c:forEach > 
  </tbody> 
  </table> 
 </td> 
 
 <td>  
 <!--
 <form:form action="/products/${ products.id }" method="post" modelAttribute="CategoryProduct">
       <form:input type="hidden" path="products" value="${ products.id }"/>
       <form:label  path="name">Add Category:</form:label>
       <form:errors path="name"/>
       <form:select path="name">
           <c:forEach items="${ newCats }" var="cat">
 	         <form:option value="${ cat.id }">${ cat.name }</form:option>
           </c:forEach>
       </form:select><br><br> 
         <div ><button>Add</button></div>   
   </form:form> 
 
 -->
 </td>    
 
</tr>
</tbody>
</table><br><br>
<div><a href="/categories/new">New Category</a></div> 
<div><a href="/products">New Product</a></div>



</body>
