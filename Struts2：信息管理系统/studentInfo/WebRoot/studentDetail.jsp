<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML>
<html>
  <head>
    <title>My JSP 'studentDetail.jsp' starting page</title>
  </head>
  
  <body>
  </body>
  <center>
  <table width="100%" border="0" cellspacing="0" cellpadding="0">
  	<tr> 
    	<td bgcolor="#CCCCCC"><table width="100%" border="0" cellspacing="1" cellpadding="3">
        <tr bgcolor="#FFCC33"> 
          <td width="10%"> <div align="center"><font color="#FFFFFF">姓 名</font></div></td>
          <td width="10%"> <div align="center"><font color="#FFFFFF">年 龄</font></div></td>
          <td width="10%"> <div align="center"><font color="#FFFFFF">学 历</font></div></td>
          <td width="10%"> <div align="center"><font color="#FFFFFF">专 业</font></div></td>
          <td width="10%"> <div align="center"><font color="#FFFFFF">班 级</font></div></td>
          <td width="10%"> <div align="center"><font color="#FFFFFF">地址</font></div></td>
          <td width="10%"> <div align="center"><font color="#FFFFFF">联系方式</font></div></td>
          <td width="10%"> <div align="center"><font color="#FFFFFF">毕业时间</font></div></td>
        </tr>
        <tr bgcolor="#FFFFFF"> 
          <td><div align="center"><font color="#000000"><s:property value="name"/></font></a></div></td>
          <td><div align="center"><font color="#000000"><s:property value="age"/></font></div></td>
          <td><div align="center"><font color="#000000"><s:property value="xueli"/></font></div></td>
          <td><div align="center"><font color="#000000"><s:property value="zhuanye"/></font></div></td>
          <td><div align="center"><font color="#000000"><s:property value="banji"/></font></div></td>
          <td><div align="center"><font color="#000000"><s:property value="dizhi"/></font></div></td>
          <td><div align="center"><font color="#000000"><s:property value="lianxi"/></font></div></td>
          <td><div align="center"><font color="#000000"><s:property value="outdate"/></font></div></td>
        </tr>
        </table>
        </center>
</html>
