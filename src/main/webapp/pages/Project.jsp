<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<jsp:include page="/helpers/head_balise.jsp">
	<jsp:param name="title" value='${projet.name}' />
</jsp:include>

<body>

	<jsp:include page="/helpers/headerConnexion.jsp" />
	<!-- Contenu page -->

	<div class="container-fluid">
		<h3><u><b>Category :</b></u> ${projet.category}</h3>
	</div>

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-4">
				<p>
				<div class="remaining_amount" data-length="60"></div>
				<p>MONEY RECOLTED on ${projet.somme_demande} euros to reach</p>
				<s:if test="#session.customerConnected != null">
					<s:url id="editDon" action="editDonAction">
						<s:param name="projetId" >${projet.projetId}</s:param>
					</s:url> <s:a href="%{editDon}">Make a donation</s:a>
				</s:if>
			</div>
			<div class="col-md-8">
				<div class="timeline" data-length="90"></div>
				<p> Beginned ${projet.date_debut} </p>
				<p> ends on ${projet.date_fin} </p>
			</div>
		</div>
	</div>

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-8">
				<h2><b>${projet.name}</b> by TEAMNAME</h2>
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
					<div class="rating">
						<span> &#9734; </span>
						<span> &#9734; </span>
						<span> &#9734; </span>
						<span> &#9734; </span>
						<span> &#9734; </span>
					</div>
				</div>
				<div class="row">
					<textarea>${projet.description}</textarea>
				</div>
			</div>
			<div class="col-md-4" id="right-part-project">
				<p>NB DONATEURS curators</p>
				<div class="palliate">
					<p>Objective : ${projet.somme_demande}</p>
					<textarea> Palliate numbre # reached ! </textarea>
				</div>
			</div>
		</div>
	</div>


	<!-- FIN_Contenu page -->
	<%@ include file="/helpers/footer.html"%>

</body>
</html>
