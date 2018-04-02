<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/19
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<a href="test?lang=en_US">English</a>&nbsp;&nbsp;
<a href="test?lang=zh_CN">中文</a>&nbsp;&nbsp;
<a href="test?lang=ja_JP">日语</a><br>
<spring:message code="username"/><br>
<spring:message code="btnOK"/><br>
<spring:message code="info"/><br>
<h5>文件上传</h5>
<form action="upload" method="post" name="f" enctype="multipart/form-data">
<input type="text" name="content" placeholder="内容描述"><br>
<input type="file" name="file"><br>
<input type="file" name="file1"><br>
<button type="submit">upload</button>
</form>
</body>
</html>
