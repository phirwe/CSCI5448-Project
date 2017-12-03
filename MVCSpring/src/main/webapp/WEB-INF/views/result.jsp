<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   <body>

      <h2>Submitted Patient Information</h2>
      <table>
         <tr>
            <td>Name</td>
            <td>${name}</td>
         </tr>
         <tr>
            <td>Age</td>
            <td>${age}</td>
         </tr>
         <tr>
            <td>ID</td>
            <td>${patient_id}</td>
         </tr>
         <tr>
            <td>Temperature</td>
            <td>${most_recent_temperature}</td>
         </tr>
         <tr>
            <td>Pressure</td>
            <td>${most_recent_pressure}</td>
         </tr>
      </table>  
   </body>
</html>