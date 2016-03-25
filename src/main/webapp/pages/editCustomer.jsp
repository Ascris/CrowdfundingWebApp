<%@ taglib prefix="s" uri="/struts-tags"%>
<html>

<jsp:include page="/helpers/head_balise.jsp" >
   <jsp:param name="title" value="Contact"/>
</jsp:include>

<body>

<jsp:include page="/helpers/headerConnexion.jsp"/>
<!-- Contenu page -->

	<div class="container-fluid">

	<h1>Inscription</h1>
		<s:form class="form-horizontal" action="saveCustomerAction" role="form">
			<s:textfield class="form-control" name="customer.username" label="Pseudo" />
			<s:password class="form-control" name="customer.mdp" label="Mot de passe" />
			<s:textfield class="form-control" name="customer.prenom" label="Prenom" />
			<s:textfield class="form-control" name="customer.name" label="Nom" />
			<s:textfield class="form-control" name="customer.mail" label="Mail" />
			<s:textarea class="form-control" name="customer.address" label="Commentaire" cols="50" rows="5" cssStyle="resize: none;"/>
			<s:submit value="Valider" />
		</s:form>
		<button onclick="window.location.href='/spring/pages/index.jsp'">Cancel</button>
		
	</div>

<!-- FIN_Contenu page -->
<%@ include file="/helpers/footer.html" %>

</body>
</html>