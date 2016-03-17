<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Crow Fooder-Modify Profile</title>
</head>
<body>


<%@ include file="/WEB-INF/headerConnexion.html" %>
<!-- Contenu page -->

<form class="profile">
  <p> New username : </p> <input type="text" name="username"> <br>
  <p> New password : </p> <input type="password" name="password"> <br>
  <p> New email : </p> <input type="text" name="email"> <br>
</form>

      <p>Ceci est une page générée depuis une JSP.</p>
      <p>
          <% 
          String attribut = (String) request.getAttribute("test");
          out.println( attribut );
          %>
      </p>
        
<%@ include file="/WEB-INF/footer.html" %>

</body>
</html>