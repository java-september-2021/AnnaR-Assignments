<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

 
<h1>New License</h1>
<body>

<form:form action="/licenses/newLicense.jsp" method="post" modelAttribute="license">  <br>
 <div >
   <form:label  path="person">Person:</form:label>
   <form:errors path="person"/>
   <form:select path="person">
     <c:forEach items="${ persons }" var="person">
 	 <form:option value="${ person.id }">${ person.firstName } ${person.lastName }</form:option>
     </c:forEach>
   </form:select>
 </div>
 <div >
   <form:label  path="state">State: </form:label>
   <form:errors path="state"/>
   <form:input  path="state"/>
 </div>
 <div >
   <form:label  path="exirationDate">Expiration Date: </form:label>
   <form:errors path="exirationDate"/>
   <form:input type="date" path="exirationDate"/>
 </div>
   <!--  <input type="submit" value="Submit"/> >
   <button>Create New License</button>
 </form:form>


</body>
