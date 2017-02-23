package dao;

import com.mysql.jdbc.PreparedStatement;

import common.ChinaUnit;
import util.JDBCInit;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.StudentModel;


public class StudentDao {
	//学员注册
    public void studentRegist(StudentModel student) throws SQLException {

            Connection con= new JDBCInit().getConnection();
            String sql="insert into student_info(name,age,xueli,zhuanye,banji,jineng,dizhi,lianxi,lianxi2,outdate)value(?,?,?,?,?,?,?,?,?,?) ";
            PreparedStatement ps= (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1,student.getName());
            ps.setInt(2,student.getAge());
            ps.setString(3,student.getXueli());
            ps.setString(4,student.getZhuanye());
            ps.setString(5,student.getBanji());
            ps.setString(6,ChinaUnit.getJnFormat(student.getJineng(), "、"));
            ps.setString(7,student.getDizhi());
            ps.setString(8,student.getLianxi());
            ps.setString(9,student.getLianxi2());
            ps.setString(10,student.getOutdate());
            ps.execute();
            new JDBCInit().closeResource(con,ps,null);
        }
    	
    	//根据条件查询学员信息
        public ArrayList<StudentModel> selectStudent(String sql) throws SQLException {
                Connection con= new JDBCInit().getConnection();
                PreparedStatement ps= (PreparedStatement) con.prepareStatement(sql);
                ResultSet rs=ps .executeQuery();
                ArrayList<StudentModel> list=new ArrayList<StudentModel>();
                while (rs.next()){
                        StudentModel s=new StudentModel();
                        s.setName(rs.getString("name"));
                        s.setAge(rs.getInt("age"));
                        s.setXueli(rs.getString("xueli"));
                        s.setZhuanye(rs.getString("zhuanye"));
                        s.setBanji(rs.getString("banji"));
                        s.setDizhi(rs.getString("dizhi"));
                        s.setLianxi(rs.getString("lianxi"));
                        s.setLianxi2(rs.getString("lianxi2"));
                        s.setOutdate(rs.getString("outdate"));
                        list.add(s);

                }
                return list;
        }
        
        //查询所有学员信息
        public ArrayList<StudentModel> selectAllStudent() throws SQLException {
            Connection con= new JDBCInit().getConnection();
            String sql="select * from student_info";
            PreparedStatement ps= (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            ArrayList<StudentModel> list=new ArrayList<StudentModel>();
            while (rs.next()){
                    StudentModel s=new StudentModel();
                    s.setName(rs.getString("name"));
                    s.setAge(rs.getInt("age"));
                    s.setXueli(rs.getString("xueli"));
                    s.setZhuanye(rs.getString("zhuanye"));
                    s.setBanji(rs.getString("banji"));
                    s.setDizhi(rs.getString("dizhi"));
                    s.setLianxi(rs.getString("lianxi"));
                    s.setLianxi2(rs.getString("lianxi2"));
                    s.setOutdate(rs.getString("outdate"));
                    list.add(s);

            }
            return list;
    }

        //删除学员信息
        public void deleteStudent(String name) throws SQLException {

            Connection con= new JDBCInit().getConnection();
            String sql="delete from student_info where name=?";
            PreparedStatement ps= (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, name);
            ps.execute();
            new JDBCInit().closeResource(con,ps,null);
        }


    }




