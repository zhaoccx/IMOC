<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>开始吧</title>
</head>
<body>
	<h1>来吧，就这样好了</h1>
	<h1>来吧，就这样好了</h1>
	<hr>
	<!-- HTML -->
	<%-- JSP --%>
	<%!
		// i注意，要用！
		String s = "你们好吧";
		int adds(int x,int y){
		return x+y;
		}
	%>
	<%
		//one
		/*
		这是注释啊
		*/
		out.println("欢迎大家来学习！！！JavaEE");
	%>
	<%
		out.println(adds(1,2));
		
	%>
	<%=s %>
	<%=adds(4, 5) %>
</body>
</html>