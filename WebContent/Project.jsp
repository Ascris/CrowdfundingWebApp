<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Crow Fooder-<!-- TODO Il faudrait ajouter le Nom du projet --></title>
</head>
<body>

<%@ include file="/WEB-INF/headerConnexion.html" %>
<!-- Contenu page -->


<div class="category">
	<p> Category : </p>
</div>

<div class="progressionBar">
	<div class="remainingAmount">
		<p> Remaining Amount : </p>
	</div>
	
	<div class="timeline">
		<p> Timeline : </p>
	</div>
</div>

<div class="projectInfos">
	<div class="projectName">
		<p> Nom projet </p>
	</div>
	<p> by </p>
	<div class="team">
		<p> TeamName </p>
	</div>
	<div class="nbDonators">
		<p> Donators : </p>
	</div>
</div>

<div class="horizontalSeparator">
	<div class="leftPart">
		<div class="projectImage">
			<a href="www.github.com"> PROJECT IMAGE </a>
		</div>
		<div class="Note"> 
			<p> Note : </p>
			<p> Etoiles a placer ici </p>
		</div>
		<div class="projectDescription"> 
			<textarea> Description of the project </textarea>
		</div>
	</div>
	<div class="rightBar">
		<div class="palliate">
			<textarea> Palliate reached ! </textarea>
		</div>
	</div>
</div>

<!-- FIN_Contenu page -->
<%@ include file="/WEB-INF/footer.html" %>

</body>
</html>