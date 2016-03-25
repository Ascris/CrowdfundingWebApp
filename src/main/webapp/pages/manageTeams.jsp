<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
   <!-- TODO ajouter des paramètres ? -->
<jsp:include page="/helpers/head_balise.jsp" >
   <jsp:param name="title" value="Teams"/>
</jsp:include>

<body>

<jsp:include page="/helpers/headerConnexion.jsp"/>
<!-- Contenu page -->
<body>
	<h1>Les Teams</h1>

	<!-- implicidement, customerList fait en fait appel à getCustomerList() -->
	<s:if test="teamList != null && teamList.size() > 0">
		<table>
			<tr>
				<th>Name</th>
				<th>mail</th>
				<th>Address</th>
				<th>Description<th>
			</tr>
			<s:iterator value="projetList" var="projet" status="userStatus">
				<tr>
					<td>${team.name}</td>
					<td>${team.mail}</td>
					<td>${team.address}</td>
					<td>${team.description}</td>

					<td><s:url id="deleteAction" action="deleteTeamAction">
							<s:param name="teamId" value="teamId" />
						</s:url>
						<s:a href="%{deleteAction}">delete</s:a></td>

					<td><s:url id="editAction" action="editTeamAction">
							<s:param name="teamId" value="teamId" />
						</s:url> <s:a href="%{editAction}">edit</s:a></td>
				</tr>
			</s:iterator>
		</table>
	</s:if>
	<button onclick="window.location.href='/spring/pages/index.jsp'">Accueil</button>

<!-- FIN_Contenu page -->
<%@ include file="/helpers/footer.html" %>
	
</body>
</html>