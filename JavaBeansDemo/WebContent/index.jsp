<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="com.bean.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Users user = new Users();
		user.setUsername("usernamessssss");
		user.setPassword("passworddddddddddd");
	%>
	<h1>e禾禾禾禾禾禾禾禾禾禾禾</h1>
	<%=user.getUsername()%>
	<%=user.getPassword()%>
</body>
</html>