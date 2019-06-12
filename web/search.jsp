<%--
  Created by IntelliJ IDEA.
  User: 10512
  Date: 2019/6/12
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <style>
        .font1{font-size:13px;}
    </style>
</head>
<body>
    <s:form action="selectDoctor" method="POST" theme="simple">
        <table border="1" width="200" cellspacing=1 class="font1">
            <tr bgcolor="aqua" >
                <td>内容选择</td>
            </tr>
            <tr>
                <td align="left" valign="top" height="400">
                    <br>医生编号：<br><br>
                    <s:textfield name="lend.Dno" size="15"/>
                    <s:submit value="查询"/>
                </td>
            </tr>
        </table>
    </s:form>
</body>
</html>
