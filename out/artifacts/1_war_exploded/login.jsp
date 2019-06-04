<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>医院预约系统</title>
</head>
<body bgcolor="#ffe4c4">
<form action="LoginServlet" method="post">
<table>
    <caption>用户登录</caption>
    <tr>
        <td>登录名</td>
        <td><input name="name" type="text" size="20"/></td>
    </tr>
    <tr>
        <td>密码</td>
        <td><input name="password" type="password" size="20"/></td>
    </tr>
</table>
    <input type="submit" value="登录"/>
    <input type="reset" value="重置"/>
</form>
</body>
</html>
