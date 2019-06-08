<%@ page contentType="text/html;charset=UTF-8" import="org.model.Login" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>欢迎使用</title>
</head>
<body>
    <s:set var="#login"  value="#session['login']"/>
    <s:property value="#login.name"/>,您好！欢迎使用医院预约信息管理系统。
</body>
</html>
