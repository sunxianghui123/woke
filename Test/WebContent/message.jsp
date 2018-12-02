<%@page import="project.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="Stylesheet" href="project.css/message.css">
<title>用户信息</title>
</head>
<body>
	<%User user = (User)session.getAttribute("user");%>
	<div id="table">
		<div id="tr">姓名:<%=user.getName()%></div>
		<div id="tr">学号:<%=user.getNumber()%></div>
		<div id="tr">性别:<%=user.getSex() %></div>
		<div id="tr">专业:<%=user.getDepartment() %></div>
		<div id="tr">班级:<%=user.getGrade() %></div>
		<div id="btn"><a href="changemessage.jsp">修改信息</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="changepassword.jsp">修改密码</a></div>
	</div>
</body>
</html>