<%@page import="project.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="Stylesheet" href="project.css/changemessage.css">
<title>修改信息</title>
</head>
<body>
		<%User user = (User)session.getAttribute("user");%>
		<form action="changemessage">
		<div id="table">
			<table align="center">
				<tr><td>姓名:</td><td><input name="name" value="<%=user.getName() %>"></td></tr>
				<tr><td>学号:</td><td><input name="number" value="<%=user.getNumber() %>"></td></tr>
				<tr><td>性别:</td><td><input name="sex" value="<%=user.getSex() %>"></td></tr>
				<tr><td>专业:</td><td><input name="department" value="<%=user.getDepartment() %>"></td></tr>
				<tr><td>班级:</td><td><input name="grade" value="<%=user.getGrade() %>"></td></tr>
			</table>
			<div id="btn"><input type="reset" value="重置">&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="提交"> </div>
		</div>
		</form>
</body>
</html>