<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.text.*,java.util.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	SimpleDateFormat sdf = new  SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
	Date d = new Date(session.getCreationTime());
	session.setAttribute("username", "admin");
%>
<%=session.getMaxInactiveInterval() %>
<%=sdf.format(d) %>
<%=session.getId() %>
sssssssssssssssssssssssssssssssssssssssssssssssssssssssss
<%=session.getAttribute("username") %>
</body>
</html>