<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%! String title = "Accueil";  %>
<%@ include file="WEB-INF/head.jsp" %>

<body>

<jsp:include page="/WEB-INF/headerConnexion.jsp" />
<!-- Contenu page -->

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



<!-- FIN_Contenu page -->
<jsp:include page="/WEB-INF/footer.jsp" />
</body>
</html>