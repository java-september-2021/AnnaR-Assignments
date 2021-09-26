<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

 <!DOCTYPE html>
 <html>
 <head>
  <meta charset="ISO-8859-1">
  <link rel="stylesheet" href="/css/style.css" />
   <title> Dojo Survey Result Index </title>
 </head>  
 <body class="lightBlueColor"> 
 <div id="formContainer">
  <div class="innerContainer2"> 
  
  <div class="underline"> Submitted Info:</div><br>
 <form action="/">
  <table style="width:80%">
  <tr>  <th> </th> </tr> 
  <tr>
    <td > Name: </td>
    <td width="300px" > ${yourName}</td>
    </tr>
  <tr> 
    <td style="leftEdgePadding"> Dojo Location:&ensp;</td>
    <td width="300px"> ${dojoLocation}</td>
    </tr>
  <tr>     
    <td style="leftEdgePadding">Favorite Language:  </td>
    <td width= "300px"> ${favLanguage}</td>
  </tr>
  <tr>  
    <td style="leftEdgePadding"> Comments:  &ensp;&ensp; </td>
    <td width="300px"> ${Comments}</td>
  </tr>
 </table >	
 <div class="fixedbutton" > <input type="submit" value="Return" class="buttonFormat"/></div>
</form> 

 </div>
</div>
</html>
 
     
   