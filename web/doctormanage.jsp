<%--
  Created by IntelliJ IDEA.
  User: 10512
  Date: 2019/6/9
  Time: 0:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>医生管理</title>
    <style>
        .font1{font-size: 13px;}
    </style>
    <script language="JavaScript">
        function check(thisObject) {
            var sTmp="";
            sTmp=thisObject.value;
            if(isNaN(sTmp))
            {
                alert("请输入输入数字");
                thisObject.select();
            }
        }
    </script>
</head>
<body>
    <table bgcolor="#f1ff66" align="center" class="font1">
        <tr>
            <td colspan="2"><jsp:include page="head.jsp"/></td>
        </tr>
        <tr>
            <s:form theme="simple" action="doctor" method="POST" enctype="multipart/form-data" validate="true">
                <td><jsp:include page="funcselect.jsp"/></td>
                <td><jsp:include page="doctorinfo.jsp"/></td>
            </s:form>
        </tr>
        <tr>
            <td colspan="2" align="center">
                陇东学院：第九号宿舍楼5楼526室；526室何先生版权所有哦~ 2019-2019
            </td>
        </tr>
    </table>
</body>
</html>
