<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="utf-8" />
    <title></title>
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
        <th colspan="3">操作</th>
    </tr>

    <c:forEach items="${userList}" var="user" varStatus="st">
        <tr>
            <td>${user.id}</td>
            <td>${user.userName}</td>
            <td>${user.sex}</td>
            <td>${user.age}</td>
            <td>${user.card}</td>
            <td>${user.address}</td>
            <td>
                <a href="findOne?id=${user.id}">详情</a>
            </td>
            <td>
                <a href="find?id=${user.id}">修改</a>
            </td>
            <td>
                <a href="delete?id=${user.id}">删除</a>
            </td>
        </tr>
    </c:forEach>

    <tr>
        <td colspan="9">
            <a href="${pageContext.request.contextPath}/add.jsp">添加</a>
        </td>
    </tr>

</table>

</body>
</html>