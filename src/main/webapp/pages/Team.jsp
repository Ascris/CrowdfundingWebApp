<%@ taglib prefix="s" uri="/struts-tags"%>"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- TODO ajouter une lecture de param�tre d'une �quipe et affichage
des infos de cette �quipe sur la page (+nom de l'�quipe dans param "title"-->
<jsp:include page="/helpers/head_balise.jsp" >
   <jsp:param name="title" value="Team"/>
</jsp:include>

<body>

<jsp:include page="/helpers/headerConnexion.jsp"/>
<!-- Contenu page -->


<!-- FIN_Contenu page -->
<%@ include file="/helpers/footer.html" %>

</body>
</html>