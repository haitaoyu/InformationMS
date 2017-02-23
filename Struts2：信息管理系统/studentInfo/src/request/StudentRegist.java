package request;

import model.StudentModel;
import agent.StudentAgent;
import common.ChinaUnit;
import requestHome.Action_I;

public class StudentRegist implements Action_I{
	private String name;
	private int age;
	private String xueli;
	private String zhuanye;
	private String banji;
	private String jineng[];
	private String dizhi;
	private String lianxi;
	private String lianxi2;
	private String outdate;
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = ChinaUnit.getChina(name);
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getBanji() {
		return banji;
	}



	public void setBanji(String banji) {
		this.banji = ChinaUnit.getChina(banji);
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



	public String[] getJineng() {
		return jineng;
	}



	public void setJineng(String[] jineng) {
		this.jineng = jineng;
	}



	public String getDizhi() {
		return dizhi;
	}



	public void setDizhi(String dizhi) {
		this.dizhi = ChinaUnit.getChina(dizhi);
	}



	public String getLianxi() {
		return lianxi;
	}



	public void setLianxi(String lianxi) {
		this.lianxi = ChinaUnit.getChina(lianxi);
	}



	public String getLianxi2() {
		return lianxi2;
	}



	public void setLianxi2(String lianxi2) {
		this.lianxi2 = ChinaUnit.getChina(lianxi2);
	}



	public String getOutdate() {
		return outdate;
	}



	public void setOutdate(String outdate) {
		this.outdate = outdate;
	}



	@Override
	public String execute() throws Exception {
		StudentModel model=new StudentModel();
		model.setName(name);
		model.setAge(age);
		model.setXueli(xueli);
		model.setZhuanye(zhuanye);
		model.setBanji(banji);
		model.setJineng(jineng);
		model.setDizhi(dizhi);
		model.setLianxi(lianxi);
		model.setLianxi2(lianxi2);
		model.setOutdate(outdate);
		new StudentAgent().studentRegist(model);
		return this.OK;
	}

}
