<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
  <head>
    <title>学员注册</title>
  </head>
  
  <body>
  <center>
  	<form action="studentRegist">
  		<table>
  		<caption>学员注册</caption>
  			<tr>
  				<td>姓名</td>
  				<td>
  					<input type="text" size="20" maxlength="6" name="name" required="required">
  				</td>
  				<td></td>
  			</tr>
  			
  			<tr>
  				<td>年龄</td>
  				<td>
  					<input type="number" min="15" max="40" name="age" required="required">
  				</td>
  				<td>提示：年龄在15~40之间为合法数值</td>
  			</tr>
  			
  				<tr>
  				<td>学历</td>
  				<td>
  					<select name="xueli">
  						<option value="初中">初中</option>
  						<option value="高中">高中</option>
  						<option value="专科">专科</option>
  						<option value="本科">本科</option>
  						<option value="硕士">硕士</option>
  						<option value="博士">博士</option>
  					</select>
  				</td>
  				<td></td>
  			</tr>
  			
  			<tr>
  				<td>专业</td>
  				<td>
  					<input type="text" size="20" maxlength="20" name="zhuanye" required="required">
  				</td>
  				<td></td>
  			</tr>
  				
  				<tr>
  				<td>所在班级</td>
  				<td>
  					<input type="text" size="20" maxlength="20" name="banji" required="required">
  				</td>
  				<td></td>
  			</tr>
  			
  			<tr>
  				<td>技能</td>
  				<td>
  					  <input name="jineng" type="checkbox"  value="JAVA" checked>
		              JAVA 
		              <input name="jineng" type="checkbox"  value="JSP">
		              JSP 
		              <input name="jineng" type="checkbox"  value="SERVLET">
		              SERVLET <br>
		              <input name="jineng" type="checkbox"  value="JavaBean">
		              JavaBean 
		              <input name="jineng" type="checkbox"  value="SQLServer">
		              SQLServer 
		              <input name="jineng" type="checkbox"  value="Oracel">
		              Oracel <br>
		              <input name="jineng" type="checkbox"  value="C语言">
		              C语言 
		              <input name="jineng" type="checkbox"  value="VC++">
		              VC++ 
		              <input name="jineng" type="checkbox"  value="VB">
		              VB <br>
		              <input name="jineng" type="checkbox"  value="J2EE">
		              J2EE 
		              <input name="jineng" type="checkbox"  value="EJB">
		              EJB 
		              <input name="jineng" type="checkbox"  value="数据结构">
		                                       数据结构 <br>
		              <input name="jineng" type="checkbox"  value="软件工程">
		                                      软件工程 
		              <input name="jineng" type="checkbox"  value="UML语言">
		              UML语言 
		              <input name="jineng" type="checkbox"  value="ACCESS数据库">
		              ACCESS数据库 
		              <input name="jineng" type="checkbox"  value="MySql">
		              MySql 
  				</td>
  				<td></td>
  			</tr>
  			
  			<tr>
  				<td>家庭住址</td>
  				<td>
  					<input type="text" size="20" maxlength="100" name="dizhi" required="required">
  				</td>
  				<td></td>
  			</tr>
  			
  			<tr>
  				<td>联系方式1</td>
  				<td>
  					<input type="text" size="20" maxlength="20" name="lianxi" required="required">
  				</td>
  				<td></td>
  			</tr>
  			
  			<tr>
  				<td>联系方式2</td>
  				<td>
  					<input type="text" size="20" maxlength="20" name="lianxi2">
  				</td>
  				<td></td>
  			</tr>
  			
  			<tr>
  				<td>毕业时间</td>
  				<td>
  					<input type="date" size="20" name="outdate" required="required">
  				</td>
  				<td></td>
  			</tr>
  			
  			
  			
  			
  			
  			<tr>
  				<td></td>
  				<td>
  					<input type="submit" value="提交">
  					<input type="reset" value="重置">
  				</td>
  				<td></td>
  			</tr>
  		
  		</table>
  	</form>
  	</center>
  </body>
</html>
