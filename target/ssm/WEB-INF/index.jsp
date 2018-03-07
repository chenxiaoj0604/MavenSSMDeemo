<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>Test</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
</head>
<body>
<h2>Students</h2>
<hr>
<div>
    <TABLE>
        <tbody>
            <tr>
                <th>姓名</th>
                <th>年龄</th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach items="${sList}" var="s">
            <tr>
                <td>${s.name}</td>
                <td>${s.age}</td>
                <td><button onclick="location.href='students/deleteStudent?id=${s.id}'">删除</button></td>
                <td>
                    <form action="students/updateStudent" method="post">
                        姓名:<input type="text" name="name" >
                        年龄:<input type="text" name="age">
                        <input type="hidden" name="id" value="${s.id}"/>
                        <input type="submit" value="修改">
                    </form>
                </td>
            </tr>
            </c:forEach>
        </tbody>
    </TABLE>
</div>
<hr>
<form action="students/addStudent" method="post">
    姓名:<input type="text" name="name" ><br>
    年龄:<input type="text" name="age"><br>
    <input type="submit" value="提交">
</form>
<hr>

</body>
</html>
