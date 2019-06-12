<%--
  Created by IntelliJ IDEA.
  User: 10512
  Date: 2019/6/12
  Time: 23:09
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
    <table border="1" align="center" width="570" cellpadding="10" cellspacing="0" bgcolor="#ff7f50" class="font1">
        <tr bgcolor="#ffebcd">
            <th>医生编号</th><th>医生姓名</th><th>性别</th><th>联系电话</th><th>职位特长</th><th>工作年限</th><th>学历水平</th><th>隶属科室编号</th>
        </tr>
        <s:iterator value="#request.list" id="lend">
        <tr>
            <td><s:property value="#lend.Dno"/></td>
            <td><s:property value="#lend.Dname"/></td>
            <td><s:property value="#lend.Sex"/></td>
            <td><s:property value="#lend.Telephone"/></td>
            <td><s:property value="#lend.Position"/></td>
            <td><s:property value="#lend.Workterm"/></td>
            <td><s:property value="#lend.Eduacationlevel"/></td>
            <td><s:property value="#lend.departmentno"/></td>
        </tr>
        </s:iterator>
</body>
</html>
