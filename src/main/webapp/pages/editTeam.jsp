<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<jsp:include page="/helpers/head_balise.jsp" >
   <jsp:param name="title" value="Team Creation"/>
</jsp:include>

<body>

<jsp:include page="/helpers/headerConnexion.jsp"/>
<!-- Contenu page -->

	<h1>Team Creating</h1>

	<s:form action="saveTeamAction">
		<s:textfield name="team.name" label="Team" />
		<s:textfield name="team.mail" label="Mail" />
		<s:textfield name="team.adress" label="Adress" />
		<s:textarea name="team.description" label="Commentaire" cols="50" rows="5" cssStyle="resize: none;"/>
		<s:submit value="Valider" />
	</s:form>
	<button onclick="window.location.href='/spring/pages/index.jsp'">Annuler</button>

<!-- FIN_Contenu page -->
<%@ include file="/helpers/footer.html" %>

</body>
</html>