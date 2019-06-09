<%--
  Created by IntelliJ IDEA.
  User: 10512
  Date: 2019/6/9
  Time: 0:31
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
    <table border="1" width="599" cellspacing="1" class="font1">
        <tr bgcolor="#ffebcd">
            <td>医生信息</td>
        </tr>
        <tr>
            <td height="400" valign="top"><br>
                <s:if test="#request.onedoctor==null">
                    <table class="font1">
                        <tr>
                            <td width="100">医生编号：</td>
                            <td><s:textfield name="doctor.dno" value=""/></td>
                            <td width="100">医生姓名：</td>
                            <td><s:textfield name="doctor.dname" value=""/></td>
                        </tr>
                        <tr>
                            <td width="100">医生性别：</td>
                            <td><s:textfield name="doctor.sex" value=""/></td>
                            <td width="100">出生日期：</td>
                            <td><s:textfield name="doctor.birthday" value=""/></td>
                        </tr>
                        <tr>
                            <td width="100">民族：</td>
                            <td><s:textfield name="doctor.nation" value=""/></td>
                            <td width="100">联系电话：</td>
                            <td><s:textfield name="doctor.telephone" value=""/></td>
                        </tr>
                        <tr>
                            <td width="100">职位/特长：</td>
                            <td><s:textfield name="doctor.position" value=""/></td>
                            <td width="100">工作年限：</td>
                            <td><s:textfield name="doctor.workterm" value=""/></td>
                        </tr>
                        <tr>
                            <td width="100">学历：</td>
                            <td><s:textfield name="doctor.eduacationlevel" value=""/></td>
                            <td width="100">科室所属：</td>
                            <td><s:textfield name="doctor.departmentno" value=""/></td>
                        </tr>
                        <tr>
                            <td colspan="4" align="center">
                                <font color="red"><s:property value="message"/></font>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                <font color="red"><s:fielderror/></font>
                            </td>
                        </tr>
                    </table>
                </s:if>
                <s:else>
                    <s:set var="onedoctor" value="#request.onedoctor"/>
                    <table>
                        <tr>
                            <td width="100">医生编号：</td>
                            <td><input type="text"  value="<s:property value="#onedoctor.dno"/>" name="doctor.dno" readonly/></td>
                            <td width="100">医生姓名：</td>
                            <td><input type="text"  value="<s:property value="#onedoctor.dname"/>" name="doctor.dname" readonly/></td>
                        </tr>
                        <tr>
                            <td width="100">医生性别：</td>
                            <td><input type="text"  value="<s:property value="#onedoctor.sex"/>" name="doctor.sex" readonly/></td>
                            <td width="100">出生日期：</td>
                            <td><input type="text"  value="<s:property value="#onedoctor.birthday"/>" name="doctor.birthday" readonly/></td>
                        </tr>
                        <tr>
                            <td width="100">民族：</td>
                            <td><input type="text"  value="<s:property value="#onedoctor.nation"/>" name="doctor.nation" readonly/></td>
                            <td width="100">联系电话：</td>
                            <td><input type="text"  value="<s:property value="#onedoctor.telephone"/>" name="doctor.telephone" readonly/></td>
                        </tr>
                        <tr>
                            <td width="100">职位/特长：</td>
                            <td><input type="text"  value="<s:property value="#onedoctor.position"/>" name="doctor.position" readonly/></td>
                            <td width="100">工作年限：</td>
                            <td><input type="text"  value="<s:property value="#onedoctor.workterm"/>" name="doctor.workterm" readonly/></td>
                        </tr>
                        <tr>
                            <td width="100">学历：</td>
                            <td><input type="text"  value="<s:property value="#onedoctor.eduacationlevel"/>" name="doctor.eduacationlevel" readonly/></td>
                            <td width="100">科室所属：</td>
                            <td><input type="text"  value="<s:property value="#onedoctor.departmentno"/>" name="doctor.departmentno" readonly/></td>
                        </tr>
                        <tr>
                            <td colspan="4" align="center">
                                <s:property value="message"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                <font color="red"><s:fielderror/></font>
                            </td>
                        </tr>
                    </table>
                </s:else>
            </td>
        </tr>
    </table>
</body>
</html>
