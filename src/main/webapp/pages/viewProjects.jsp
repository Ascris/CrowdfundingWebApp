<%@ taglib prefix="s" uri="/struts-tags"%>
<s:set name="tableau">0</s:set>
<html>

   <!-- TODO ajouter des paramètres ? -->
<jsp:include page="/helpers/head_balise.jsp" >
   <jsp:param name="title" value="Projects"/>
</jsp:include>

<body>

<jsp:include page="/helpers/headerConnexion.jsp"/>
<!-- Contenu page -->

	<h1>Liste des projets</h1>

	<!-- implicidement, customerList fait en fait appel à getCustomerList() -->
	<s:if test="projetList != null && projetList.size() > 0">
		<table class="viewProjectONLY">
			<s:iterator value="projetList" var="projet" status="userStatus">
				<s:if test="%{#tableau==0}">
				<tr>
					<td>
					${projet.description}
						<div class= "project-overview">
						<s:url id="viewProjet" action="viewProjetAction">
							<s:param name="projetId" >${projet.projetId}</s:param>
						</s:url> <s:a href="%{viewProjet}">See more</s:a>
						</div>
					</td>
					
				</s:if>
				<s:if test="%{#tableau==1}">
					<td>${projet.description}</td>
						<td>
							<div class= "project-overview"> 
							<s:url id="viewProjet" action="viewProjetAction">
								<s:param name="projetId" >${projet.projetId}</s:param>
							</s:url> <s:a href="%{viewProjet}">See more</s:a>
							</div>
						</td>
				</tr>
				</s:if>
				
				<s:if test="%{#tableau==1}">
					<s:set name="tableau">0</s:set>
				</s:if>
				<s:else>
					<s:set name="tableau">1</s:set>
				</s:else>
			
			</s:iterator>
			<s:if test="%{#tableau==1}">
				</tr>
			</s:if>
		</table>
	</s:if>
	
<!-- FIN_Contenu page -->
<%@ include file="/helpers/footer.html" %>
	
</body>
</html>