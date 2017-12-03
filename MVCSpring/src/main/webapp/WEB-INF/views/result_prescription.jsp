<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   <body>

      <h2>Submitted Prescription Information</h2>
      <table>
         <tr>
            <td>Prescription</td>
            <td>${prescription_id}</td>
         </tr>
         <tr>
            <td>Patient</td>
            <td>${patient_id}</td>
         </tr>
         <tr>
            <td>Inventory</td>
            <td>${inventory_id}</td>
         </tr>
         
      </table>  
   </body>
</html>