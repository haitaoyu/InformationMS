<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML>
<html>
  <head>
    <title>My JSP 'studentSelect.jsp' starting page</title>
  </head>
  
  <body>
  <center>
  	<form action="studentSelect">
  		<table>
  		<caption>学员查询</caption>
  			<tr>
  				<td>姓名：</td>
  				<td><input type="text" name="name" maxlength="6" size="20"></td>
  			</tr>
  			<tr>
  				<td>年龄：</td>
  				<td><input type="number" name="age" min="15" max="40" size="20"></td>
  			</tr>
  			<tr>
  				<td>学历：</td>
  				<td>
  					<select name="xueli" class="borderstyle">
			          <option value="初中">初中</option>
			          <option value="高中">高中</option>
			          <option value="中专">中专</option>
			          <option value="大专">大专</option>
			          <option value="本科">本科</option>
			          <option value="硕士">硕士</option>
			          <option value="博士">博士</option>
        			</select>
        		</td>
    		</tr>
    		<tr>
  				<td>专业：</td>
  				<td><input type="text" name="zhuanye" maxlength="20" size="20"></td>
  			</tr>
  			<tr>
  				<td><input type="reset" value="重置" ></td>
  				<td><input type="submit" value="按以上条件查询"></td>
  			</tr>
  				
  		
  		
  		</table>
  	
  	</form>
  </center>
  </body>
</html>
