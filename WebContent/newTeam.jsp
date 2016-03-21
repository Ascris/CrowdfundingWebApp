<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%! String title = "New Team";  %>
<%@ include file="WEB-INF/head.jsp" %>

<body>

<jsp:include page="/WEB-INF/headerConnexion.jsp" />
<!-- Contenu page -->

<div class="container-fluid">
	<form class="form-group">
	  <p> Team name : </p> <input type="text" class="form-group has-feedback" name="username"> <br>
	  <p> Team email : </p> <input type="text" class="form-group has-feedback" name="email"> <br>
	  <p> Team members : </p> <textarea class="form-group has-feedback" name="members"> </textarea>
	  <button type="submit" class="btn btn-default">Submit</button>
	</form>
</div>




<!-- FIN_Contenu page -->
<jsp:include page="/WEB-INF/footer.jsp" />

</body>
</html>