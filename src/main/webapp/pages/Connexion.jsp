<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<jsp:include page="../helpers/head.jsp" >
   <jsp:param name="title" value="Log in"/>
</jsp:include>

<body>

<jsp:include page="/helpers/headerConnexion.html" />
<!-- Contenu page -->

<div class="container-fluid">
	<form class="profile">
		<p> Username : </p> <input type="text" name="username"> <br>
		<p> Password : </p> <input type="password" name="password"> <br>
		<p> Email : </p> <input type="text" name="email"> <br>
	</form>
</div>

<jsp:include page="/helpers/footer.jsp" />

</body>
</html>