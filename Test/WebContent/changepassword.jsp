<%@page import="project.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="Stylesheet" href="project.css/changepassword.css">
<title>修改密码</title>
</head>
<body>
	<%User user = (User)session.getAttribute("user"); %>
	<div id="main_div">
		<form action="changepassword">
			<p align="center"><font size="5.5" color="yellow">修改密码</font></p>
			<div id="password">学号:<%=user.getNumber() %></div>
			<div id="password">旧密码:<input name="oldpassword"></div>
			<div id="password">新密码:<input name="newpassword"></div>
			<div id="password">确认密码:<input name="chaeckpassword"></div>
			<div id="btn"><input type="reset" value="重置">&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="提交"></div>
		</form>
	</div>
</body>
</html>