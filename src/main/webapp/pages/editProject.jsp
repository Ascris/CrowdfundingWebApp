<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<jsp:include page="/helpers/head_balise.jsp" >
   <jsp:param name="title" value="Project Creation"/>
</jsp:include>

<body>

<jsp:include page="/helpers/headerConnexion.jsp"/>
<!-- Contenu page -->

	<h1>Creation d'un Projet</h1>

	<s:form action="saveProjetAction">
		<s:textfield name="projet.name" label="Project Name"/>
		<s:textfield name="projet.somme_demande" label="How many money do you need ?"/>
		<!-- <s:textfield name="projet.date_fin" key="Date de fin" /> -->
		<s:textarea name="projet.description" label="Commentary" cols="50" rows="5" cssStyle="resize: none;"/>
		<s:textfield name="projet.category" label="Category" />
		<s:submit value="Validate" />
	</s:form>
	<button onclick="window.location.href='/spring/pages/index.jsp'">Cancel</button>


<!-- FIN_Contenu page -->
<%@ include file="/helpers/footer.html" %>

</body>
</html>