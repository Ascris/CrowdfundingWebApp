<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="/helpers/head_balise.jsp" >
   <jsp:param name="title" value="Home"/>
</jsp:include>

<body>

<jsp:include page="/helpers/headerConnexion.jsp"/>
<!-- Contenu page -->

<div class="bandeau_intro">
	<h1>WELCOME on Crow Fooder !</h1>
	<h2>Become a crow fooder and join the awesome community of crow fooders</h2>
</div>

<div class="contenu_centre">
	<div>
		<p>See users list</p>
		<button onclick="window.location='/spring/listCustomerAction'">Fooders</button>
	</div>
	
	<div>
		<p>See projects list</p>
		<button onclick="window.location='/spring/listProjetAction'">Projets</button>
	</div>
	
	<div>
		<p>See teams list</p>
		<button onclick="window.location='/spring/listTeamAction'">Projets</button>
	</div>
</div>

<!-- FIN_Contenu page -->
<%@ include file="/helpers/footer.html" %>

</body>
</html>