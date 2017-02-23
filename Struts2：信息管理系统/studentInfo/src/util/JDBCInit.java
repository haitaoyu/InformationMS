package util;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.sql.Connection;


public class JDBCInit {
	public  Connection getConnection() {
		
			Properties pro=new Properties();
			try {	
					pro.load(JDBCInit.class.getClassLoader().getResourceAsStream("peizhi.properties"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			String driver=pro.getProperty("driver");
			String user=pro.getProperty("user");
			String password=pro.getProperty("password");
			String url=pro.getProperty("url");
			Connection con=null;
			
				
				try {
					Class.forName(driver);
					con=DriverManager.getConnection(url, user, password);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			return con;
		
}
	
	public  void closeResource(Connection con,Statement sta,ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(sta!=null){
			try {
				sta.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(con!=null){
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
