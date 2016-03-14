<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign in</title>
</head>
<body>

<%@ include file="/headerConnexion.html" %>

<form class="profile">
  <p> Username : </p> <input type="text" name="username"> <br>
  <p> Password : </p> <input type="password" name="password"> <br>
  <p> Email : </p> <input type="text" name="email"> <br>
</form>

<%@ include file="/footer.html" %>

</body>
</html>