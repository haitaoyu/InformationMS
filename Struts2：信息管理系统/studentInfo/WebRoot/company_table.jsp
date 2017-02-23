<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加公司信息</title>
</head>
<body>
<form method="post" action="companyRegist">
    <table width="70%" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
            <td><p>
                <font color="#999999">添加公司信息</font></p>
                <p>&nbsp;</p></td>
        </tr>
        <tr>
            <td bgcolor="#999999"><table width="100%" border="0" cellspacing="1" cellpadding="3">
                <tr bgcolor="#FFFFFF">
                    <td height="24" colspan="2"><font size="2">公司名称：</font> <input name="gongsiname" type="text" class="borderstyle"  size="40" required="required" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')">
                        <div align="center"></div></td>
                </tr>
                <tr bgcolor="#FFFFFF">
                    <td height="24" colspan="2"><font size="2">总经理名称：
                        <input name="jingli" type="text" class="borderstyle"  size="40" required="required" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')">
                    </font></td>
                </tr>
                <tr bgcolor="#FFFFFF">
                    <td height="24" colspan="2"><font size="2">总经理联系方式：
                        <input name="jingli_lianxi" type="text" class="borderstyle"  size="40" required="required" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')">
                    </font></td>
                </tr>
                <tr bgcolor="#FFFFFF">
                    <td width="47%"><font size="2">联系人：
                        <input name="lianxiren" type="text" class="borderstyle"  size="18" required="required" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')">
                    </font></td>
                    <td width="53%"><font size="2">职 务：
                        <input name="zhiwu" type="text" class="borderstyle" size="18" required="required" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')">
                    </font></td>
                </tr>
                <tr bgcolor="#FFFFFF">
                    <td><font size="2">电 话1：
                        <input name="tel1" type="text" class="borderstyle" size="18" required="required" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')">
                    </font></td>
                    <td width="53%"><font size="2">电 话2：
                        <input name="tel2" type="text" class="borderstyle" size="18" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')">
                    </font></td>
                </tr>
                <tr bgcolor="#FFFFFF">
                    <td><font size="2">手 机：
                        <input name="phone" type="text" class="borderstyle"  size="18" required="required" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')">
                    </font></td>
                    <td width="53%"><font size="2">E-MAIL：
                        <input name="email" type="text" class="borderstyle" size="18" required="required" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')">
                    </font></td>
                </tr>
                <tr bgcolor="#FFFFFF">
                    <td colspan="2"><font size="2">公司需求：
                        <input name="xuqiu" type="text" class="borderstyle"  size="40" required="required" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')">
                    </font></td>
                </tr>
                <tr bgcolor="#FFFFFF">
                    <td colspan="2"><font size="2">公司网址：
                        <input name="gongsiurl" type="text" class="borderstyle"  size="40" required="required" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')">
                    </font></td>
                </tr>
                <tr bgcolor="#FFFFFF">
                    <td colspan="2"><font size="2">公司地址：
                        <input name="dizhi" type="text" class="borderstyle"  size="40" required="required" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')">
                    </font></td>
                </tr>
                <tr bgcolor="#FFFFFF">
                    <td colspan="2"><font size="2">公司简介：
                        <textarea name="gongsijianjie" rows="5" cols="40" required="required" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')"></textarea>
                    </font></td>
                </tr>
                <tr bgcolor="#FFFFFF">
                    <td colspan="2">&nbsp;</td>
                </tr>
                <tr bgcolor="#FFFFFF">
                    <td colspan="2"><div align="center">
                        <input name="Submit" type="submit" class="borderstyle" value="添加此公司的信息">
                    </div></td>
                </tr>
            </table></td>
        </tr>
    </table>
</form>
</body>

</html>
