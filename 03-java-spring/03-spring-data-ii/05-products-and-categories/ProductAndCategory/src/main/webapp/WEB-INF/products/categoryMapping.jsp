
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
  
<head> 
   <link rel="stylesheet" href="/css/style.css" /> 
   <title> Product Page </title>
</head>   

<body>
 <h1>${ products.name }</h1>
 <div id = "baseContainer">   
    <div  id = "innerContainer">
	      <div class="productCategoryList" >
	          <h3>Categories:</h3>
	          <c:forEach items="${ products.categories }" var="cat">    
	             <ul class="listformat">
	                <li>${cat.name}</li>
	             </ul>    
	          </c:forEach > 
	      </div> 
	      
	      <div class="newCategoryList">
		    <form  action="/products/${ products.id }/show" method="post" >
		        <label name="category"> Add Category: </label>
		        <select title="" name="category">      
		           <c:forEach items="${ newCats }" var="cat">
		 	         <option value="${ cat.id }">${ cat.name }</option>
		 	         
		           </c:forEach>
		        </select>
		       <errors path="category"/>        
	           <div><input class="buttonCategoryformat" id="button"  type="submit" value="Add" /></div>   
	       </form>            
		</div> 	      
    </div>  
    
    <div><a href="/categories/new">New Category</a></div> 
    <div><a href="/products">New Product</a></div>              		
 </div>		  
</body>
