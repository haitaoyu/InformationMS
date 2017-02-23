package request;

import java.util.ArrayList;

import model.CompanyModel;
import model.StudentModel;
import agent.CompanyAgent;
import agent.StudentAgent;
import requestHome.Action_I;

public class CompanySelect implements Action_I{
	private String gongsiname;
	private String xuqiu;
	private String norecord;
	private ArrayList<CompanyModel> list;
	
	public String getGongsiname() {
		return gongsiname;
	}



	public void setGongsiname(String gongsiname) {
		this.gongsiname = gongsiname;
	}

	public String getXuqiu() {
		return xuqiu;
	}



	public void setXuqiu(String xuqiu) {
		this.xuqiu = xuqiu;
	}



	public String getNorecord() {
		return norecord;
	}



	public void setNorecord(String norecord) {
		this.norecord = norecord;
	}
	
	public ArrayList<CompanyModel> getList() {
		return list;
	}



	public void setList(ArrayList<CompanyModel> list) {
		this.list = list;
	}



	@Override
	public String execute() throws Exception {
		ArrayList<CompanyModel> list=new CompanyAgent().selectCompany(gongsiname, xuqiu);
		if (list.size()==0) {
			this.norecord="没有查询到与此条件相符的学员信息！";
			return Action_I.INPUT;
			
		}
		this.setList(list);
		return this.OK;
	}

}
