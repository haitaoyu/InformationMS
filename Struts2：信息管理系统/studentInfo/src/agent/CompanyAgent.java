package agent;


import dao.CompanyDao;
import dao.StudentDao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.CompanyModel;

public class CompanyAgent {
    public void AddCompany(CompanyModel company) throws SQLException {
        new CompanyDao().AddCompany(company);
    }
    
    public ArrayList<CompanyModel> selectCompany(String gongsiname,String xuqiu) throws SQLException {
    	String sql="select * from company_info where 1=1";
    	if (!"".equals(gongsiname)) {
			sql+=" and gongsiname='"+gongsiname+"'";
		}
    	
    	if (!"".equals(xuqiu)) {
    		sql+=" and xuqiu='"+xuqiu+"'";
    	}
    	
    	return new CompanyDao().selectCompany(sql);
    }
}
