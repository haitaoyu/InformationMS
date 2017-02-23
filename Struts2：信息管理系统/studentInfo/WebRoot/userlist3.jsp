<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML>
<html>
  <head>
    <title>My JSP 'userlist.jsp' starting page</title>
   <script type="text/javascript">
		function detail(gongsiname)
		{
			window.open("companyDetail?gongsiname="+gongsiname,"detailCompany",'height=200,width=900,top=100,left=500,toolbar=no');
		}
	</script>
 </head>
  
  <body>
  <center>
  <table width="60%" border="1" cellspacing="0" cellpadding="0">
  	 
        <tr bgcolor="#FFCC33"> 
          <td width="17%"> <div align="center"><font color="#FFFFFF">公司名称</font></div></td>
          <td width="10%"> <div align="center"><font color="#FFFFFF">总经理</font></div></td>
          <td width="12%"> <div align="center"><font color="#FFFFFF">联系方式</font></div></td>
          <td width="16%"> <div align="center"><font color="#FFFFFF">公司需求</font></div></td>
          <td width="12%"> <div align="center"><font color="#FFFFFF">操作选项</font></div></td>
        </tr>
        <s:iterator id="list" value="list">
        <tr bgcolor="#FFFFFF"> 
          <td><div align="center"><font color="#000000"><s:property value="gongsiname"/></font></a></div></td>
          <td><div align="center"><font color="#000000"><s:property value="jingli"/></font></div></td>
          <td><div align="center"><font color="#000000"><s:property value="jingli_lianxi"/></font></div></td>
          <td><div align="center"><font color="#000000"><s:property value="xuqiu"/></font></div></td>
		  <td><a href="javascript://" onclick="detail('<s:property value="gongsiname"/>')">详细</a></td>        
        </tr>
        </s:iterator>
        </table>
        <p style="text-align:center"><s:property value="norecord"/></p>
        </center>

  </body>
</html>
