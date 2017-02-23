<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>公司信息查询</title>
</head>
<body>
<table width="40%" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
        <td><p><font color="#CCCCCC">公司信息查询(<font color="#FFCC00">
            什么也不写则查询全部</font>)</font></p></td>
    </tr>
</table>
<form action="companySelect" method="post" >
    <table width="40%" border="0" align="center" cellpadding="3" cellspacing="0">
        <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td> <font size="2">请输入公司名称：
                <input name="gongsiname" type="text" class="borderstyle" size="15">
            </font> </td>
        </tr>
        <tr>
            <td><font size="2"> 请输入公司需求：
                <input name="xuqiu" type="text" class="borderstyle" size="15">
            </font></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td><div align="center"><font size="2">
                <input name="Submit" type="submit" class="borderstyle" value="按以上条件查询">
            </font></div></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
        </tr>
    </table>
</form>

</body>
</html>
