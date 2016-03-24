<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<jsp:include page="/helpers/head_balise.jsp" >
   <jsp:param name="title" value="Modify User"/>
</jsp:include>

<body>

<jsp:include page="/helpers/headerConnexion.jsp"/>
<!-- Contenu page -->

<div class="container-fluid">
	<form class="profile">
	  <p> New username : </p> <input type="text" name="username"> <br>
	  <p> New password : </p> <input type="password" name="password"> <br>
	  <p> New email : </p> <input type="text" name="email"> <br>
	</form>
</div>

<div class="container-fluid">
      <p>Ceci est une page générée depuis une JSP.</p>
      <p>
          <% 
          String attribut = (String) request.getAttribute("test");
          out.println( attribut );
          %>
      </p>
</div>

<!-- FIN_Contenu page -->
<%@ include file="/helpers/footer.html" %>

</body>
</html>