<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Bootstrap required head -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<!-- Bootstrap required head-->


<title>New Team</title>
</head>
<body>

<%@ include file="WEB-INF/headerConnexion.html" %>

<div class="containder-fluid">
	<form class="team">
	  <p> Team name : </p> <input type="text" name="username"> <br>
	  <p> Team email : </p> <input type="text" name="email"> <br>
	  <p> Team members : </p> <textarea> </textarea>
	</form>
</div>

<%@ include file="WEB-INF/footer.html" %>

</body>
</html>