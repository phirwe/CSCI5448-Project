<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   <body>

      <h2>Student Information</h2>
      <form:form method = "POST" action = "/MVCSpring/loginPagePost">
         <table>
            <tr>
               <td><form:label path = "login_id">ID</form:label></td>
               <td><form:input path = "login_id" /></td>
            </tr>
            <tr>
               <td><form:label path = "password">Password</form:label></td>
               <td><form:input type = "password" path = "password" /></td>
            </tr>

            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
</html>