<%@ page contentType="text/html;charset=UTF-8" import="org.model.Login" %>
<html>
<head>
    <title>欢迎使用</title>
</head>
<body>
    <%
        Login login=(Login)session.getAttribute("login");
        String lgn=login.getName();
    %>
    <%= lgn%>,您好，欢迎使用医院信息系统。
</body>
</html>
