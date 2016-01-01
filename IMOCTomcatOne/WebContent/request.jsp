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
		request.setCharacterEncoding("UTF-8");
		request.setAttribute("password", "ssssssssssss");
	%>

	<h1>request内置对象</h1>
	用户名：<%=request.getParameter("username")%>
	爱好：<%
		String[] fav = request.getParameterValues("fav");
		if (null != fav) {
			for (String fas : fav) {
				out.println(fas + "<br />");
			}
		}
	%>
	<%
		out.print(request.getAttribute("password"));
		out.print(request.getContentType());
		out.print(request.getContextPath());
		out.print(request.getProtocol());
		out.print(request.getServerName());
		out.print(request.getAttribute("password"));
		out.print(request.getAttribute("password"));
		out.print(request.getAttribute("password"));
		out.print(request.getAttribute("password"));
		out.print(request.getAttribute("password"));
		out.print(request.getAttribute("password"));
		out.print(request.getAttribute("password"));
		out.print(request.getAttribute("password"));
		out.print(request.getAttribute("password"));
	%>

</body>
</html>