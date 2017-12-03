<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   <body>

      <h2>Patient Information</h2>
      <form:form method = "POST" action = "/MVCSpring/pharmacistUploadPost">
         <table>
           
            <tr>
               <td><form:label path = "inventory_id">inventory_id</form:label></td>
               <td><form:input path = "inventory_id" /></td>
            </tr>
            <tr>
               <td><form:label path = "cost">cost</form:label></td>
               <td><form:input path = "cost" /></td>
            </tr>
            <tr>
               <td><form:label path = "quantity">quantity</form:label></td>
               <td><form:input path = "quantity" /></td>
            </tr>
            
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
</html><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>