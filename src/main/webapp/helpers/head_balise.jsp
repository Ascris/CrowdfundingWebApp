<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Bootstrap required head -->
<spring:url value="/resources/bootstrap/css/bootstrap.min.css" var="BootCss" />
<spring:url value="/resources/bootstrap/js/bootstrap.min.js" var="BootJs" />

<%-- <link href="<c:url value="bootstrap/css/bootstrap.min.css" />" rel="stylesheet" type="text/css" /> --%>
<link href="${BootCss}" rel="stylesheet" />
<script src="${BootJs}"></script>

<link href="/spring/resources/stylesheet.css" rel="stylesheet"
	type="text/css" />
<!-- <link href="/spring/resources/bootstrap/css/bootstrap.min.css" -->
<!-- 	rel="stylesheet" type="text/css" /> -->
<!-- <script type="text/javascript" -->
<!-- 	src="/spring/resources/bootstrap/js/bootstrap.min.js"></script> -->
<!-- Bootstrap required head-->

<title>Crow Fooder-<%=request.getParameter("title")%></title>
</head>