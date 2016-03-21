<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%! String title = "Project";  %>
<%@ include file="WEB-INF/head.jsp" %>
<body>


<jsp:include page="/WEB-INF/headerConnexion.jsp" >
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
<jsp:include page="/WEB-INF/footer.jsp" />

</body>
</html>