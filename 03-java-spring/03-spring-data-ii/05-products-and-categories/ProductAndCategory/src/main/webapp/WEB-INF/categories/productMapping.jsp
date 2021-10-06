
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
  
<head> 
   <link rel="stylesheet" href="/css/style.css" /> 
   <title> Category Page </title>
</head>
 

<body>

 <h1>${ categories.name }</h1>
 <div id = "baseContainer">
 
  
    <div  id = "innerContainer">
	      <div class="categoryProductList" >
	          <h3>Products:</h3>
	          <c:forEach items="${ categories.products }" var="prod">    
	             <ul class="listformat">
	                <li>${prod.name}</li>
	             </ul>    
	          </c:forEach > 
	      </div> 
	      
	      <div class="newProductList">
		    <form  action="/categories/${ categories.id }/show" method="post" >
		        <label name="product"> Add Product: </label>
		        <select title="" name="product">      
		           <c:forEach items="${ newProds }" var="prod">
		 	         <option value="${ prod.id }">${ prod.name }</option>
		 	         
		           </c:forEach>
		        </select>
		       <errors path="product"/>        
	           <div><input class="buttonProductformat" id="button"  type="submit" value="Add" /></div>   
	      </form>            
		</div> 			      
    </div>  
    <div><a href="/categories/new">New Category</a></div> 
    <div><a href="/products">New Product</a></div>
               		
</div>		


<br><br>



</body>
