<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		out.println(out.getClass());
		out.print("<br />");
		out.println(request.getClass());
		out.print("<br />");
		out.println(response.getClass());
		out.print("<br />");
		out.print(session.getClass());
		out.print("<br />");
		out.print(page.getClass());
		out.print("<br />");
		out.print(pageContext.getClass());
		out.print("<br />");
		out.print(application.getClass());
		out.print("<br />");
		out.print(config.getClass());
		out.print("<br />");
		//out.print(execption)
		out.print("<br />");
		out.print("<br />");
		out.print("<br />");
	%>

</body>
</html>