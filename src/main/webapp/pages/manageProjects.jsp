<%@ taglib prefix="s" uri="/struts-tags"%>
<html>

   <!-- TODO ajouter des paramètres ? -->
<jsp:include page="/helpers/head_balise.jsp" >
   <jsp:param name="title" value="Projects"/>
</jsp:include>

<body>

<jsp:include page="/helpers/headerConnexion.jsp"/>
<!-- Contenu page -->

	<h1>Les Projets</h1>

	<!-- implicidement, customerList fait en fait appel à getCustomerList() -->
	<s:if test="projetList != null && projetList.size() > 0">
		<table>
			<tr>
				<th>Name</th>
				<th>Somme Demande</th>
				<th>Description</th>
				<th>Date de création<th>
			</tr>
			<s:iterator value="projetList" var="projet" status="userStatus">
				<tr>
					<td>${projet.name}</td>
					<td>${projet.somme_demande}</td>
					<td>${projet.description}</td>
					<td>${projet.date_debut}</td>
					<td>
					<s:if test="#session.customerConnected != null">
						<td>
							<s:url id="deleteAction" action="deleteProjetAction">
								<s:param name="projetId" value="projetId" />
							</s:url>
							<s:a href="%{deleteAction}">delete</s:a></td>
							
						<td><s:url id="myeditAction" action="editProjetAction"/>
						 <s:a href="%{myeditAction}">edit</s:a></td>
					</s:if>
				</tr>
			</s:iterator>
		</table>
	</s:if>
	
<!-- FIN_Contenu page -->
<%@ include file="/helpers/footer.html" %>
	
</body>
</html>