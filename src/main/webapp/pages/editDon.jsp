<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<jsp:include page="/helpers/head_balise.jsp" >
   <jsp:param name="title" value="Project Creation"/>
</jsp:include>

<body>

<jsp:include page="/helpers/headerConnexion.jsp"/>
<!-- Contenu page -->

	<h1>Creation d'un Don</h1>

	<s:form action="saveDonAction">
		<s:hidden name="don.customer" label="plop"/>
		<s:textarea name="don.don" label="Don" value=""> </s:textarea>
		<s:submit value="Valider" />
	</s:form>
	<button onclick="window.location.href='/spring/pages/index.jsp'">Annuler</button>


<!-- FIN_Contenu page -->
<%@ include file="/helpers/footer.html" %>

</body>
</html>