package dao;


import com.mysql.jdbc.PreparedStatement;
import util.JDBCInit;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

	public Boolean selectPassword(String username,String password) throws SQLException {

        Connection con= new JDBCInit().getConnection();
        String sql="select * from users where username=? and password=?";
        PreparedStatement ps= (PreparedStatement) con.prepareStatement(sql);
        ps.setString(1,username);
        ps.setString(2,password);
        ResultSet rs=ps.executeQuery();
        while (rs.next()){
          return true;
        }
        new JDBCInit().closeResource(con,ps,rs);
        return false;
    }




}
