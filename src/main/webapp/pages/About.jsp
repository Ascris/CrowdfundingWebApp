<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%! String title = "About Crow Fooder";  %>
<%@ include file="/helpers/head.jsp" %>

<jsp:include page="/helpers/headerConnexion.jsp" />

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

<div class="container-fluid">
	<div class=Description_site>
		<div class="row">
			<p> This web site has been created as a crowdfunding site </p> <br>
		</div>
		<div class="row">
			<div align="initial_members_horizontal">
				<p> Initial members </p>
				<textarea class="members"> </textarea>
			</div>
		</div>
	</div>
</div>


<div class="container-fluid">
	<div class="Background_about">
		<p> Crow Fooder - main page </p>
	</div>
</div>

<jsp:include page="/helpers/footer.jsp" />

</body>
</html>