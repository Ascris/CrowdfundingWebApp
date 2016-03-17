<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>About Crow Fooder</title>
</head>

<body>
<!-- HEADER 
<Home_button class="left">
if(1 == User_connected) {
	<Connected_user>
		<Modify_profile />
		<Log_out />
	</Connected_user>
} else {
	<Connection_bar>
		<Sign_in />
		<Log_in/>
	</Connection_bar>
</Home_button>
}
-->

<%@ include file="/headerConnexion.html" %>


<!-- Description site -->
<div class=Description_site>
	<p> This web site has been created as a crowdfunding site </p>
	<br>
	<div align="initial_members_horizontal">
		<p> Initial members </p>
		<textarea class="members"> </textarea>
	</div>
</div>

<!-- MAIN PAGE -->
<div class=Background_about>
	<p> Crow Fooder - main page </p>
</div>

<%@ include file="/footer.html" %>

</body>
</html>