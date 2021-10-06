
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
  
<head> 
   <link rel="stylesheet" href="/css/style.css" /> 
   <title> Category Page </title>
</head>
 

<body>
//===========================================================
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
    Products 
   <form id="inputForm" action="/categories/${ products.id }" method="post" >
    <c:forEach items="${ allProducts }" var="allprod"> 
     <tr>
       <td><ul><li><a href="/categories/${allprod.id}">${allprod.name}</a></li></ul></td><br>
     </tr>
    </c:forEach > 
     </form> 
  </tbody> 
  </table> 
 </td> 
 
 <td>  
<h3><br><br> </h3>
 <form id="inputForm" action="/categories/${ products.id }" method="post" >
 <label> Add Product: </label>
       <select title="" name="product">
           <c:forEach items="${ newProds }" var="prod">
 	         <option value="${ prod.id }">${ prod.name }</option>
           </c:forEach>
       </select><br><br> 
         <div ><input id="button"  type="submit" value="Add" /></div>   
   </form> 
   

 </td>    
 
</tr>
</tbody>
</table>
//===========================================================
 <h1>${ products.name }</h1>
 <div id = "baseContainer">
 
  
    <div  id = "innerContainer">
	      <div class="productCategoryLists" >
	          <h3>Categories:</h3>
	          <c:forEach items="${ products.categories }" var="cat">    
	             <ul>
	                <li>${cat.name}</li>
	             </ul><br>    
	          </c:forEach > 
	      </div> 
	      
	      <div class="newCategoryLists">
		    <form  action="/products/${ products.id }/show" method="post" >
		        <label name="category"> Add Category: </label>
		        <select title="" name="category">      
		           <c:forEach items="${ newCats }" var="cat">
		 	         <option value="${ cat.id }">${ cat.name }</option>
		 	         
		           </c:forEach>
		        </select>
		       <errors path="category"/>        
	           <div><input id="button"  type="submit" value="Add" /></div>   
	      </form>            
		</div> 
		
	      
    </div>             		
</div>		


<br><br>
<div><a href="/categories/new">New Category</a></div> 
<div><a href="/products">New Product</a></div>



</body>
