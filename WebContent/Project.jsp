<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Crow Fooder-<!-- TODO Il faudrait ajouter le Nom du projet --></title>

<!-- Bootstrap required head -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<!-- Bootstrap required head-->

</head>
<body>

<%@ include file="/WEB-INF/headerConnexion.html" %>
<!-- Contenu page -->

<button class="btn btn-warning">
Hi
</button>

<div class="container-fluid">
	<p> Category : </p>
</div>

<div class="container-fluid">
	<div class="row">
		<div class="col-md-3">
			<p> Remaining Amount : </p>
		</div>
		<div class="col-md-9">
			<p> BARRE DE PROGRESSION A METTRE ICI </p>
		</div>
	</div>
	<div class="row">
		<div class="col-md-3">
			<p> Timeline : </p>
		</div>
		<div class="col-md-9">
			<p> Timeline HERE </p>
		</div>
	</div>
</div>


<div class="container-fluid">
	<div class="row">
		<div class="col-md-3">
			<p> Nom projet </p>
		</div>
		<div class="col-md-1">
			<p> by </p>
		</div>
		<div class="col-md-3">
			<p> TeamName </p>
		</div>
		<div class="col-md-5">
			<p> Donators : </p>
		</div>
	</div>
</div>

<div class="container-fluid">
	<div class="row">
		<div class="col-md-8">
			<div class="row">
					<a href="www.github.com"> PROJECT IMAGE </a>
			</div>
			<div class="row"> 
				<p> Note : </p>
				<p> Etoiles a placer ici </p>
			</div>
			<div class="row">
				<textarea> Description of the project </textarea>
			</div>
		</div>
		<div class="col-md-4">
			<div class="palliate">
				<textarea> Palliate reached ! </textarea>
			</div>
		</div>
	</div>
</div>

<!-- FIN_Contenu page -->
<%@ include file="/WEB-INF/footer.html" %>

</body>
</html>