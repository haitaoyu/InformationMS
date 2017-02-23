package agent;

import dao.StudentDao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.StudentModel;

public class StudentAgent {
    public void studentRegist(StudentModel student) throws SQLException {
        new StudentDao().studentRegist(student);
    }
    public ArrayList<StudentModel> selectAllStudent() throws SQLException {
    	return new StudentDao().selectAllStudent();
    }
    public void deleteStudent(String name) throws SQLException {
    	new StudentDao().deleteStudent(name);
    }
    public ArrayList<StudentModel> selectStudent(String name,String age,String xueli,String zhuanye) throws SQLException {
    	String sql="select * from student_info where 1=1";
    	if (!"".equals(name)) {
			sql+=" and name='"+name+"'";
		}
    	
    	if (!"".equals(age)) {
			sql+=" and age="+age;
		}
    	
    	if (!"".equals(xueli)) {
    		sql+=" and xueli='"+xueli+"'";
		}
    	
    	if (!"".equals(zhuanye)) {
    		sql+=" and zhuanye='"+zhuanye+"'";
		}
    	
    	return new StudentDao().selectStudent(sql);
    
    
    
    }
}

