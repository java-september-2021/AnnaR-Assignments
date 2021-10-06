
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
  
<head> 
   <link rel="stylesheet" href="/css/main2.css" /> 
   <title> Product Page </title>
</head>   




<title> Product Page </title>
 

<body>

<table style="width:40%" >
<thead>
<tr >
   <th colspan="2" style="font-size:30px">Product Page</th> 
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
    <c:forEach items="${ products.categories }" var="cat"> 
     <tr>
       <td><ul><li><a href="/products/${cat.id}">${cat.name}</a></li></ul></td><br>
     </tr>
    </c:forEach > 
  </tbody> 
  </table> 
 </td> 
 
 <td>  
<h3><br><br> </h3>
 <form id="inputForm" action="/products/${ products.id }" method="post" modelAttribute="category" >
 <label> Add Category: </label>
       <select title="" name="category">
           <c:forEach items="${ newCats }" var="cat">
 	         <option value="${ cat.id }">${ cat.name }</option>
           </c:forEach>
       </select><br><br> 
         <div ><input id="button"  type="submit" value="Add" /></div>   
   </form> 
   

 </td>    
 
</tr>
</tbody>
</table><br><br>


<div>  

 <div id = "topNavDashboard">
    <div  id = "innertopNavDashboard">
	      <div class="topNavLinksAndFieldDashboard" >
	          <c:forEach items="${ products.categories }" var="cat">    
	             <ul>
	                <li>${cat.name}</li>
	             </ul><br>    
	          </c:forEach > 
	      </div> 
	      
	      <div class="topNavLinksAndFieldDashboard">
	          <form id="inputForm" action="/products/${ products.id }" method="post" modelAttribute="category" >
	              <label> Add Category: </label>	       
			      <select class = "addSongFieldAlignment2" path="category">
			         <c:forEach items="${NewCategories}" var = "i" >		          		        
						<option value="${i}" > ${i}</option>
					 </c:forEach>
				 </select>
		             <div ><input id="button"  type="submit" value="Add" /></div>   
              </form> 
	      
	      </div>             		
    </div>		
 </div>


</div>




<div><a href="/categories/new">New Category</a></div> 
<div><a href="/products">New Product</a></div>



</body>
