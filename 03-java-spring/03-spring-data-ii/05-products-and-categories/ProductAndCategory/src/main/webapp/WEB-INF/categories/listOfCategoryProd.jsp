
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
  
<head> <link rel="stylesheet" href="/css/main4.css" /> </head>   




<title> Product Mapping </title>
 

<body>

<table style="width:30%" >
<thead>
<tr >
   <th colspan="2" style="font-size:30px">Products</th> 
</tr>
</thead>
 <tbody> 
 <tr> 
 <col >
  <td style="font-size:30px" >
  
  <table class="center" ><tbody><tr><td>
  <div class="textAlign">
 
    <c:forEach items="${ ListOfProducts }" var="prod"> 
     <tr>
       <td><ul><li><a href="/categories/${prod.id}">${prod.name}</a></li></ul></td><br>
     </tr>
    </c:forEach > 

  </div>
  </td> 
  
 </td></tr></tbody></table>
  
</tr>
</tbody>
</table><br><br>
<div><a href="/categories/new">New Category</a></div> 
<div><a href="/products">New Product</a></div>



</body>
