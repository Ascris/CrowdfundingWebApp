<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

   <!-- TODO ajouter des paramètres ? -->
<jsp:include page="/helpers/head_balise.jsp" >
   <jsp:param name="title" value="Customer"/>
</jsp:include>

<body>

<jsp:include page="/helpers/headerConnexion.jsp"/>
<!-- Contenu page -->


	<h1>Les Fooders</h1>

	<!-- implicidement, customerList fait en fait appel à getCustomerList() -->
	<s:if test="customerList != null && customerList.size() > 0">
		<table>
			<tr>
				<th>Username</th>
				<th>Prenom</th>
				<th>Nom</th>
				<th>Date de creation</th>
				<th>Commentaire</th>
				<th>mdplol</th>
				<th></th>
			</tr>
			<!-- Grâce à s:iterator, on peut iterer sur une liste se situant dans le code java. 
				Ici, on itère donc sur customerList, qui se trouve dans la classe ListCustomerAction
				et on stocke l'utilisateur actuel dans la variable customer. Pour que cela fonctionne,
				il faut néanmoins qu'il existe que cet objet existe dans ListCustomerAction -->
			<s:iterator value="customerList" var="customer" status="userStatus">
				<tr>
					<!-- customer.customerId appelle en fait getCustomer().getCustomerId(), il faut donc 
					respecter rigouresement la syntaxe des getters/setters 
					(à savoir minuscule pour le premier mot, majuscule pour les suivants) -->
					<td>${customer.username}</td>
					<td>${customer.prenom}</td>
					<td>${customer.name}</td>
					<td>${customer.formatCreatedDate}</td>
					<td>${customer.address}</td>
					<td>${customer.mdp}</td>
					<!-- On définit ici une url qui référence l'action deleteCustomerAction
					 définie dans struts.xml, puis on l'affecte à un lien -->
					<td><s:url id="deleteAction" action="deleteCustomerAction">
							<s:param name="customerId" value="customerId" />
						</s:url> 
						<!-- %{deleteAction} fait donc ici reference à l'url 
						dont l'id est deleteAction (défini juste au dessus) -->
						<s:a href="%{deleteAction}">delete</s:a></td>

					<td><s:url id="editAction" action="editCustomerAction">
							<s:param name="customerId" value="customerId" />
						</s:url> <s:a href="%{editAction}">edit</s:a></td>
					<!--<td><s:url id="addOrder" action="addOrderAction">
							<s:param name="customerId" value="customerId" />
						</s:url> <s:a href="%{addOrder}">new order</s:a></td> -->
				</tr>
				<!-- ici, orderCustomers fait appel à la méthode getOrderCustomers()
				 qui renvoie la liste contenue dans le client courant de la boucle 
				<s:if test="orderCustomers != null && orderCustomers.size() > 0">
					<s:iterator value="orderCustomers" var="orderCustomer"
						status="orderStatus">
						<tr>
							<td />
							<td>Commande N°</td>
							<td>${orderCustomer.orderCustomerId}</td>
							<td>réalisée le</td>
							<td>${orderCustomer.orderDate}</td>
							<td><s:url id="deleteOrder" action="deleteOrderAction">
									<s:param name="orderCustomerId" value="orderCustomerId" />
								</s:url> <s:a href="%{deleteOrder}">delete</s:a></td>
						</tr>
					</s:iterator>
				</s:if>
				-->
			</s:iterator>
		</table>
	</s:if>
	<button onclick="window.location.href='/spring/pages/index.jsp'">Accueil</button>
	
<!-- FIN_Contenu page -->
<%@ include file="/helpers/footer.html" %>

</body>
</html>