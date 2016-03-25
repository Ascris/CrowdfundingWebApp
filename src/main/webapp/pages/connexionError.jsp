<%@ taglib prefix="s" uri="/struts-tags"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<jsp:include page="/helpers/head_balise.jsp" >
   <jsp:param name="title" value="Contact"/>
</jsp:include>

<body>

<jsp:include page="/helpers/headerConnexion.jsp"/>
<!-- Contenu page -->

<div class="container-fluid">
	<p class="erreurCo"> Erreur de connexion ! </p>
</div>


<!-- FIN_Contenu page -->
<%@ include file="/helpers/footer.html" %>

</body>
</html>