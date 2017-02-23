<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML>
<html>
  <head>
    <title>My JSP 'userlist.jsp' starting page</title>
   <script type="text/javascript">
		function detail(name)
		{
			window.open("studentDetail?name="+name,"detailStudent",'height=200,width=900,top=100,left=500,toolbar=no');
		}
	</script>
 </head>
  
  <body>
  <center>
  <table width="60%" border="1" cellspacing="0" cellpadding="0">
        
        <tr bgcolor="#FFCC33">  
          <td width="17%"> <div align="center"><font color="#FFFFFF">姓 名</font></div></td>
          <td width="10%"> <div align="center"><font color="#FFFFFF">年 龄</font></div></td>
          <td width="12%"> <div align="center"><font color="#FFFFFF">学 历</font></div></td>
          <td width="16%"> <div align="center"><font color="#FFFFFF">专 业</font></div></td>
          <td width="12%"> <div align="center"><font color="#FFFFFF">操作选项</font></div></td>
        </tr>
        <s:iterator id="list" value="list">
        <tr bgcolor="#FFFFFF"> 
          <td><div align="center"><font color="#000000"><s:property value="name"/></font></a></div></td>
          <td><div align="center"><font color="#000000"><s:property value="age"/></font></div></td>
          <td><div align="center"><font color="#000000"><s:property value="xueli"/></font></div></td>
          <td><div align="center"><font color="#000000"><s:property value="zhuanye"/></font></div></td>
		  <td><a href="javascript://" onclick="detail('<s:property value="name"/>')">详细</a></td>        
        </tr>
        </s:iterator>
        </table>
        <p style="text-align:center">
        <s:property value="norecord"/></p>
        </center>

  </body>
</html>
