<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Crow Fooder-Accueil</title>
</head>
<body>
<%@ include file="/WEB-INF/headerConnexion.html" %>

<!-- MAIN PAGE -->
<div class=Hello>
	<h1>WELCOME on Crow Fooder !</h1>

	<h2>Become a crow fooder and join the awesome community of crow fooders</h2>
</div>

		<p>Ceci est une page générée depuis une JSP.</p>
        <p>
            <% 
            String attribut = (String) request.getAttribute("test");
            out.println( attribut );
            %>
        </p>

<%@ include file="/WEB-INF/footer.html" %>
</body>
</html>