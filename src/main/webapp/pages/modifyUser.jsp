<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Bootstrap required head -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<!-- Bootstrap required head-->

<title>Crow Fooder-Modify Profile</title>
</head>
<body>

<jsp:include page="../helpers/headerConnexion.jsp" />
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

<jsp:include page="../helpers/footer.jsp" />

</body>
</html>