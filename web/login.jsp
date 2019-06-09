<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>医院预约系统</title>
</head>
<body bgcolor="#ffe4c4">
<s:form action="login" method="post" theme="simple">
<table>
    <caption>用户登录</caption>
    <tr>
        <td>登录名<s:textfield name="login.name" size="20"/> </td>
    </tr>
    <tr>
        <td>密&nbsp;&nbsp;码<s:password name="login.password" size="20"/></td>
    </tr>
    <tr>
        <td>
            <s:submit value="登录"/>
            <s:reset value="重置"/>
        </td>
    </tr>
    <tr>
        <td>
            <font color="red"><s:fielderror/><s:property value="message"/></font>
        </td>
    </tr>
</table>
</s:form>
</body>
</html>
