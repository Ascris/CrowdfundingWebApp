<%@ taglib prefix="s" uri="/struts-tags"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<jsp:include page="/helpers/head_balise.jsp" >
   <jsp:param name="title" value="Accueil"/>
</jsp:include>

<body>

<jsp:include page="/helpers/headerConnexion.jsp"/>
<!-- Contenu page -->

<div class="container-fluid">
	<div class=Description_site>
		<div class="row">
			<p> This web site has been created as a crowdfunding site </p> <br>
		</div>
		<div class="row">
			<div align="initial_members_horizontal">
				<p> Initial members </p>
				<textarea class="members"> </textarea>
			</div>
		</div>
	</div>
</div>


<div class="container-fluid">
	<div class="Background_about">
		<p> Crow Fooder - main page </p>
	</div>
</div>

<%@ include file="/helpers/footer.html" %>

</html>