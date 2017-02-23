package request;

import java.util.ArrayList;

import common.ChinaUnit;
import agent.StudentAgent;
import model.StudentModel;
import requestHome.Action_I;

public class StudentDetail implements Action_I {
	private String name;
	private int age;
	private String xueli;
	private String zhuanye;
	protected String banji;
	private String dizhi;
	private String lianxi;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getXueli() {
		return xueli;
	}

	public void setXueli(String xueli) {
		this.xueli = xueli;
	}

	public String getZhuanye() {
		return zhuanye;
	}

	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}

	public String getBanji() {
		return banji;
	}

	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	public String getDizhi() {
		return dizhi;
	}

	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}

	public String getLianxi() {
		return lianxi;
	}

	public void setLianxi(String lianxi) {
		this.lianxi = lianxi;
	}

	public String getOutdate() {
		return outdate;
	}

	public void setOutdate(String outdate) {
		this.outdate = outdate;
	}

	private String outdate;
	private ArrayList<StudentModel> list;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = ChinaUnit.getChina(name);
	}
	
	public ArrayList<StudentModel> getList() {
		return list;
	}

	public void setList(ArrayList<StudentModel> list) {
		this.list = list;
	}

	@Override
	public String execute() throws Exception {
		ArrayList<StudentModel> list=new StudentAgent().selectStudent(name, "", "", "");
		StudentModel model=(StudentModel)list.get(0);
		this.setAge(model.getAge());
		this.setXueli(model.getXueli());
		this.setZhuanye(model.getZhuanye());
		this.setBanji(model.getBanji());
		this.setDizhi(model.getDizhi());
		this.setLianxi(model.getLianxi());
		this.setOutdate(model.getOutdate());
		
		return this.OK;
	}

}
