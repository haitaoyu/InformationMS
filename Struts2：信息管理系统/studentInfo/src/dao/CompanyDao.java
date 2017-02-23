package dao;

import com.mysql.jdbc.PreparedStatement;

import util.JDBCInit;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.CompanyModel;
import model.StudentModel;


public class CompanyDao {
    public void AddCompany(CompanyModel company) throws SQLException {
        Connection con = new JDBCInit().getConnection();
        String sql = "insert into company_info(gongsiname,jingli,jingli_lianxi,lianxiren,zhiwu,tel1,tel2,phone,email,xuqiu,gongsiurl,dizhi,gongsijianjie)value(?,?,?,?,?,?,?,?,?,?,?,?,?) ";
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
        ps.setString(1,company.getGongsiname());
        ps.setString(2,company.getJingli());
        ps.setString(3,company.getJingli_lianxi());
        ps.setString(4,company.getLianxiren());
        ps.setString(5,company.getZhiwu());
        ps.setString(6,company.getTel1());
        ps.setString(7,company.getTel2());
        ps.setString(8,company.getPhone());
        ps.setString(9,company.getEmail());
        ps.setString(10,company.getXuqiu());
        ps.setString(11,company.getGongsiurl());
        ps.setString(12,company.getDizhi());
        ps.setString(13,company.getGongsijianjie());
        ps.execute();
        new JDBCInit().closeResource(con,ps,null);
    }
    
    public ArrayList<CompanyModel> selectCompany(String sql) throws SQLException {
        Connection con= new JDBCInit().getConnection();
        PreparedStatement ps= (PreparedStatement) con.prepareStatement(sql);
        ResultSet rs=ps .executeQuery();
        ArrayList<CompanyModel> list=new ArrayList<CompanyModel>();
        while (rs.next()){
               CompanyModel c=new CompanyModel();
               c.setGongsiname(rs.getString("gongsiname"));
               c.setJingli(rs.getString("jingli"));
               c.setXuqiu(rs.getString("xuqiu"));
               c.setJingli_lianxi(rs.getString("jingli_lianxi"));
               c.setLianxiren(rs.getString("lianxiren"));
               c.setZhiwu(rs.getString("zhiwu"));
               c.setXuqiu(rs.getString("xuqiu"));
               c.setGongsiurl(rs.getString("gongsiurl"));
               c.setDizhi(rs.getString("dizhi"));
               
               list.add(c);

        }
        return list;
}
}
