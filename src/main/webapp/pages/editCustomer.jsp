<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
</head>

<body>
	<h1>Inscription</h1>

	<s:form action="saveCustomerAction">
		<s:textfield name="customer.username" label="Pseudo" />
		<s:password name="customer.mdp" label="Mot de passe" />
		<s:textfield name="customer.prenom" label="Prenom" />
		<s:textfield name="customer.name" label="Nom" />
		<s:textfield name="customer.mail" label="Mail" />
		<s:textarea name="customer.address" label="Commentaire" cols="50" rows="5" cssStyle="resize: none;"/>
		<s:submit value="Valider" />
	</s:form>
	<button onclick="window.location.href='/spring/pages/index.jsp'">Annuler</button>
</body>
</html>