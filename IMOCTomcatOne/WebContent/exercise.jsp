<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>九九乘法表</h1>
	<%!String pringMultiTable(int n) {
		String s = "";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				s += i + "*" + j + "=" + (i * j) + "&nbsp;&nbsp&nbsp&nbsp";
			}
			s += "<br />";
		}
		return s;
	}

	void prinString(JspWriter out, int n) throws Exception {
		String s = "";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				out.print(i + "*" + j + "=" + (i * j) + "&nbsp;&nbsp&nbsp&nbsp");
			}
			out.print("<br />");
		}
	}%>

	<%=pringMultiTable(9)%>
	<% prinString(out, 9); %>
</body>
</html>