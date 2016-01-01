<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>response内置对象</title>

</head>
<body>
	<%
		//response.setContentType("text/html;charset=UTF-8");
		out.println("<h1>response内置对象</h1>");
		//out.flush();
		//outer.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
		//response.sendRedirect("reg.jsp");
		//response.sendRedirect("request.jsp");
		request.getRequestDispatcher("request.jsp").forward(request,response);
	%>

</body>
</html>