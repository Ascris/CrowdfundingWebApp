<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Crow Fooder-Accueil</title>
</head>
<body>

<%@ include file="../helpers/headerConnexion.html" %>
<!-- Contenu page -->

<h1>WELCOME on Crow Fooder !</h1>

<h2>Become a crow fooder and join the awesome community of crow fooders</h2>

<div style="margin-bottom:20px;" >
	<p>Voir la liste des utilisateurs</p>
	<button onclick="window.location='/spring/listCustomerAction'">Fooders</button>
</div>

<!-- FIN_Contenu page -->
<%@ include file="../helpers/footer.html" %>

</body>
</html>