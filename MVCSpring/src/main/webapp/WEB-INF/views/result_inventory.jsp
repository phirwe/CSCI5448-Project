<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   <body>

      <h2>Submitted Inventory Information</h2>
      <table>
         <tr>
            <td>Inventoryid</td>
            <td>${inventory_id}</td>
         </tr>
         <tr>
            <td>cost</td>
            <td>${cost}</td>
         </tr>
         <tr>
            <td>quantity</td>
            <td>${quantity}</td>
         </tr>
         
      </table>  
   </body>
</html>