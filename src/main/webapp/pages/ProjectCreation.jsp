<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<jsp:include page="/helpers/head_balise.jsp" >
   <jsp:param name="title" value="Project Creation"/>
</jsp:include>

<body>

<jsp:include page="/helpers/headerConnexion.jsp"/>
<!-- Contenu page -->

	<div class="container-fluid">

	<h1>Project creation</h1>
		<s:form class="form-horizontal" action="" role="form">
			<s:submit value="Valider" />
		</s:form>
		<button onclick="window.location.href='/spring/pages/index.jsp'">Cancel</button>
		
	</div>

<!-- FIN_Contenu page -->
<%@ include file="/helpers/footer.html" %>

</body>
</html>