<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<jsp:include page="/helpers/head_balise.jsp">
	<jsp:param name="title" value="Project" />
</jsp:include>

<body>

	<jsp:include page="/helpers/headerConnexion.jsp" />
	<!-- Contenu page -->

<%-- <%=request.getParameter("project")%> --%>

	<div class="container-fluid">
		<p>Category : CATEGORIE</p>
	</div>

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-3">
				<p>Remaining Amount : MONTANT RESTANT</p>
			</div>
			<div class="col-md-9">
				<p>BARRE DE PROGRESSION A METTRE ICI</p>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3">
				<p>Timeline :</p>
			</div>
			<div class="col-md-9">
				<p class="timeline timeline-begin">Beginned :
					${projet.date_debut}</p>
				<p class="timeline timeline-middle">TIMELINE</p>
				<p class="timeline timeline-end">Ends in : ${projet.date_debut}
					TIMELINE</p>
			</div>
		</div>
	</div>

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-8">
				<p>${projet.name}by ${projet.teamName}</p>
				<%-- <%= request.getParameter("team.name") --%>
			</div>
		</div>
	</div>

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-7" id="left-part-project">
				<div class="row">
					<img src="/spring/resources/images/crow_seattle.jpg"
						alt="Crow on Seattle on postal card" height="300" />
				</div>
				<div class="row">
					<p>Rating :</p>
					<p>ETOILES ICI</p>
				</div>
				<div class="row">
					<textarea>${projet.description}</textarea>
				</div>
			</div>
			<div class="col-md-4" id="right-part-project">
				<p>NB DONATEURS curators</p>
				<div class="palliate">
					<p>Objective : ${projet.somme_demande}</p>
					<textarea> Palliate reached ! </textarea>
				</div>
			</div>
		</div>
	</div>


	<!-- FIN_Contenu page -->
	<%@ include file="/helpers/footer.html"%>

</body>
</html>
