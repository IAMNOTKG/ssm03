<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>详情页面</title>
</head>
<body>

<table border="1">

    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>年龄</th>
        <th>身份证</th>
        <th>籍贯</th>
    </tr>
    <tr>
        <td>${user.id}</td>
        <td>${user.userName}</td>
        <td>${user.sex}</td>
        <td>${user.age}</td>
        <td>${user.card}</td>
        <td>${user.address}</td>
    </tr>

    <tr>
        <td colspan="6"><a href="${pageContext.request.contextPath}/user/back">返回</a></td>
    </tr>

</table>


</body>
</html>