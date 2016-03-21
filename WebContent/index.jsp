<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Bootstrap required head -->
<link href=”bootstrap/css/bootstrap.min.css” rel=”stylesheet” type=”text/css” />
<script type=”text/javascript” src=”bootstrap/js/bootstrap.min.js”></script>
<!-- Bootstrap required head-->

<title>Crow Fooder-Accueil</title>
</head>

<body>
<%@ include file="/WEB-INF/headerConnexion.html" %>

<!-- MAIN PAGE -->
<div class="container-fluid">
	<div class="row">
		<h1>WELCOME on Crow Fooder !</h1>
	</div>
	<div class="row">
		<h2>Become a crow fooder and join the awesome community of crow fooders</h2>
	</div>
</div>

<div class="container-fluid">
		<p>Ceci est une page générée depuis une JSP.</p>
        <p>
            <% 
            String attribut = (String) request.getAttribute("test");
            out.println( attribut );
            %>
        </p>
</div>

<%@ include file="/WEB-INF/footer.html" %>
</body>
</html>