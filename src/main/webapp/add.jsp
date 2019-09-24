<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加</title>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath}/user/add">

    <table border="1">
        <tr>
            <td colspan="2">添加用户信息</td>
        </tr>
        <tr>
            <td>姓名</td>
            <td>
                <input type="text" name="userName" />
            </td>
        </tr>
        <tr>
            <td>性别</td>
            <td>
                <input type="text" name="sex" />
            </td>
        </tr>
        <tr>
            <td>年龄</td>
            <td>
                <input type="text" name="age" />
            </td>
        </tr>
        <tr>
            <td>身份证</td>
            <td>
                <input type="text" name="card" />
            </td>
        </tr>
        <tr>
            <td>地址</td>
            <td>
                <input type="text" name="address" />
            </td>
        </tr>

        <tr>
            <td>
                <a href="${pageContext.request.contextPath}/user/back">返回</a>
            </td>
            <td>
                <input type="submit" value="提交" />
            </td>
        </tr>

    </table>

</form>
</body>
</html>
