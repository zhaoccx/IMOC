<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<hr>
<%
	SimpleDateFormat sdf = new  SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
	Date d = new Date(session.getCreationTime());
	session.setAttribute("username", "admin");
%>
<%=session.getMaxInactiveInterval() %>
<%=sdf.format(d) %>
<%=session.getId() %>
<hr>
<a href="sessionpage2.jsp" target="_blank">ssssssssss</a>
</body>
</html>