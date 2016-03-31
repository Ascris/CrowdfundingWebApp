<%@ taglib prefix="s" uri="/struts-tags"%>
<html>

   <!-- TODO ajouter des paramètres ? -->
<jsp:include page="/helpers/head_balise.jsp" >
   <jsp:param name="title" value="Projects"/>
</jsp:include>

<body>

<jsp:include page="/helpers/headerConnexion.jsp"/>
<!-- Contenu page -->

	<h1>Les Dons</h1>

	<!-- implicidement, customerList fait en fait appel à getCustomerList() -->
	<s:if test="donList != null && donList.size() > 0">
		<table>
			<tr>
				<th>Don</th>
				<th>Projet<th>
			</tr>
			<s:iterator value="donList" var="mydon" status="userStatus">
				<tr>
					<td>${mydon.don}</td>
					<td>${mydon.projet}</td>
					<td>${mydon.customer}</td>
					<td>
					<s:if test="#session.customerConnected != null">
						<td>
							<s:url id="deleteAction" action="deleteDonAction">
								<s:param name="donId" value="donId" />
							</s:url>
							<s:a href="%{deleteAction}">delete</s:a></td>
							
						<td><s:url id="editAction" action="editDonAction">
								<s:param name="donId" value="donId" />
							</s:url>
						 <s:a href="%{editAction}">edit</s:a></td>
					</s:if>
				</tr>
			</s:iterator>
		</table>
	</s:if>
	
<!-- FIN_Contenu page -->
<%@ include file="/helpers/footer.html" %>
	
</body>
</html>