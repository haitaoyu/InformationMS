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
          <td width="10%"> <div align="center"><font color="#FFFFFF">公司名称</font></div></td>
          <td width="10%"> <div align="center"><font color="#FFFFFF">总经理</font></div></td>
          <td width="10%"> <div align="center"><font color="#FFFFFF">联系方式</font></div></td>
          <td width="10%"> <div align="center"><font color="#FFFFFF">联系人</font></div></td>
          <td width="10%"> <div align="center"><font color="#FFFFFF">职务</font></div></td>
          <td width="10%"> <div align="center"><font color="#FFFFFF">需求</font></div></td>
          <td width="10%"> <div align="center"><font color="#FFFFFF">公司网址</font></div></td>
          <td width="10%"> <div align="center"><font color="#FFFFFF">公司地址</font></div></td>
        </tr>
        <tr bgcolor="#FFFFFF"> 
          <td><div align="center"><font color="#000000"><s:property value="gongsiname"/></font></a></div></td>
          <td><div align="center"><font color="#000000"><s:property value="jingli"/></font></div></td>
          <td><div align="center"><font color="#000000"><s:property value="jingli_lianxi"/></font></div></td>
          <td><div align="center"><font color="#000000"><s:property value="lianxiren"/></font></div></td>
          <td><div align="center"><font color="#000000"><s:property value="zhiwu"/></font></div></td>
          <td><div align="center"><font color="#000000"><s:property value="xuqiu"/></font></div></td>
          <td><div align="center"><font color="#000000"><s:property value="gongsiurl"/></font></div></td>
          <td><div align="center"><font color="#000000"><s:property value="dizhi"/></font></div></td>
        </tr>
        </table>
        </center>
</html>
