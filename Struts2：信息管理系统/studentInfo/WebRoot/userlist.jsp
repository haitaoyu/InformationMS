<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML>
<html>
  <head>
    <title>My JSP 'userlist.jsp' starting page</title>
    <script type="text/javascript">
		function del(name,a)
		{
			if(confirm("确实要是删除用户名为："+name+"用户吗？"))
			{
				a.href="./studentdelete?name="+name;
			}
		}
	</script>
 </head>
  
  <body>
  <center>
  <table width="60%" border="0" cellspacing="0" cellpadding="0">
  	<tr> 
    	<td bgcolor="#CCCCCC"><table width="100%" border="0" cellspacing="1" cellpadding="3">
        <tr bgcolor="#FFCC33"> 
          <td width="17%"> <div align="center"><font color="#FFFFFF">姓 名</font></div></td>
          <td width="10%"> <div align="center"><font color="#FFFFFF">年 龄</font></div></td>
          <td width="12%"> <div align="center"><font color="#FFFFFF">学 历</font></div></td>
          <td width="16%"> <div align="center"><font color="#FFFFFF">专 业</font></div></td>
          <td width="29%"> <div align="center"><font color="#FFFFFF">家庭住址</font></div></td>
          <td colspan="2"> <div align="center"><font color="#FFFFFF">操作选项</font></div></td>
        </tr>
        
        <s:iterator id="list" value="list">
        <tr bgcolor="#FFFFFF"> 
          <td><div align="center"><font color="#000000"><s:property value="name"/></font></a></div></td>
          <td><div align="center"><font color="#000000"><s:property value="age"/></font></div></td>
          <td><div align="center"><font color="#000000"><s:property value="xueli"/></font></div></td>
          <td><div align="center"><font color="#000000"><s:property value="zhuanye"/></font></div></td>
          <td> <div align="center"><font color="#000000"><s:property value="dizhi"/></font></div></td>
          <td width="8%"><div align="center"><a href="javascript://" onclick="del('<s:property value="name"/>',this)"><font color="#000000">删除</font></a></div></td>
        </tr>
        </s:iterator>
        </table>
        </center>

  </body>
</html>
