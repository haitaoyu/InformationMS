<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body background="image/background.png">
<h1 style="color: azure ">WebOA 信息档案管理系统</h1>
<div style="height: 100px"></div>
<center>
   <form action="login" method="post">
   <h3 style="color: azure"><s:property value="errorMessage"/></h3>
    <table>
    <tr>
        <td style="color: azure;font-size: x-large">
            账号：
        </td>
        <td>
            <input style="width: 200px;height: 30px" type="text"  name="username" maxlength="6" required="required" />
        </td>
    </tr>
    <tr>
        <td style="color: azure;font-size: x-large">
           密码：
        </td>
        <td>
            <input style="width: 200px;height: 30px" type="password" name="password" maxlength="6" required="required"/>
        </td>
    </tr>
        <tr></tr>
    <tr>
        <td></td>
        <td>
        <input  style="width: 200px;height: 30px;background: orange;color: aliceblue" type="submit" value="进入系统"/>
    </td>

        </tr>

    </table>

    </form>
</center>

</body>
</html>
