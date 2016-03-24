<%@ taglib prefix="s" uri="/struts-tags"%>
<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<jsp:include page="../helpers/head.jsp" >
   <jsp:param name="title" value="New Team"/>
</jsp:include>

<body>

<jsp:include page="/helpers/headerConnexion.html" />
<!-- Contenu page -->

<div class="container-fluid">
	<form class="team">
	  <p> Team name : </p> <input type="text" name="username"> <br>
	  <p> Team email : </p> <input type="text" name="email"> <br>
	  <p> Team members : </p> <textarea> </textarea>
	</form>
</div>




<!-- FIN_Contenu page -->
<jsp:include page="/helpers/footer.jsp" />

</body>
</html>