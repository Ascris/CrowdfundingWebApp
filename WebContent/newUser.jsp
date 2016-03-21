<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%! String title = "New Profile";  %>
<%@ include file="WEB-INF/head.jsp" %>

<body>

<jsp:include page="/WEB-INF/headerConnexion.jsp" >
<!-- Contenu page -->

<div class="container-fluid">
	<form class="profile">
	  <p> Username : </p> <input type="text" name="username"> <br>
	  <p> Password : </p> <input type="password" name="password"> <br>
	  <p> Email : </p> <input type="text" name="email"> <br>
	</form>
</div>




<!-- FIN_Contenu page -->
<jsp:include page="/WEB-INF/footer.jsp" />

</body>
</html>