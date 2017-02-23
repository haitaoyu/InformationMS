package request;

import java.util.ArrayList;

import model.StudentModel;
import agent.StudentAgent;
import common.ChinaUnit;
import requestHome.Action_I;

public class StudentSelect implements Action_I{
	private String name;
	private String age;
	private String xueli;
	private String zhuanye;
	private String norecord;
	private ArrayList<StudentModel> list;

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = ChinaUnit.getChina(name);
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}



	public String getXueli() {
		return xueli;
	}



	public void setXueli(String xueli) {
		this.xueli = ChinaUnit.getChina(xueli);
	}



	public String getZhuanye() {
		return zhuanye;
	}



	public void setZhuanye(String zhuanye) {
		this.zhuanye = ChinaUnit.getChina(zhuanye);
	}



	public ArrayList<StudentModel> getList() {
		return list;
	}



	public void setList(ArrayList<StudentModel> list) {
		this.list = list;
	}

	public String getNorecord() {
		return norecord;
	}



	public void setNorecord(String norecord) {
		this.norecord = norecord;
	}



	@Override
	public String execute() throws Exception {
		ArrayList<StudentModel> list=new StudentAgent().selectStudent(name, age, xueli, zhuanye);
		if (list.size()==0) {
			this.norecord="没有查询到与此条件相符的学员信息！";
			return Action_I.INPUT;
			
		}
		this.setList(list);
		return this.OK;
	}

}
