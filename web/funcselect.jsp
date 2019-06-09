<%--
  Created by IntelliJ IDEA.
  User: 10512
  Date: 2019/6/9
  Time: 0:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <style>
        .font1{font-size: 13px;}
    </style>
</head>
<body>
    <table border="1" width="200" cellspacing="1" class="font1">
        <tr bgcolor="#ff7f50">
            <td>功能选择</td>
        </tr>
        <tr>
            <td align="center" valign="top" height="400">
                <br><s:submit value="医生增加" method="addDoctor"/><br>
                <br><s:submit value="医生删除" method="deleteDoctor"/><br>
                <br><s:submit value="医生修改" method="updateDoctor"/><br>
                <br><s:submit value="医生查询" method="selectDoctor"/><br>
            </td>
        </tr>
    </table>
</body>
</html>
