<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   <body>

      <h2>Student Information</h2>
      <form:form method = "POST" action = "/MVCSpring/nurseUploadPost">
         <table>
           
            <tr>
               <td><form:label path = "patient_id">patient_id</form:label></td>
               <td><form:input path = "patient_id" /></td>
            </tr>
            <tr>
               <td><form:label path = "most_recent_temperature">Temperature</form:label></td>
               <td><form:input path = "most_recent_temperature" /></td>
            </tr>
            <tr>
               <td><form:label path = "most_recent_pressure">Pressure</form:label></td>
               <td><form:input path = "most_recent_pressure" /></td>
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