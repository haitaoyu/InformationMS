package request;

import java.util.ArrayList;

import common.ChinaUnit;

import model.CompanyModel;
import agent.CompanyAgent;
import requestHome.Action_I;

public class CompanyDetail implements Action_I {
	private String gongsiname;
	private String jingli;
	private String jingli_lianxi;
	private String lianxiren;
	private String zhiwu;
	private String xuqiu;
	private String gongsiurl;
	private String dizhi;
	

	public String getGongsiname() {
		return gongsiname;
	}


	public void setGongsiname(String gongsiname) {
		this.gongsiname = ChinaUnit.getChina(gongsiname);
	}


	public String getJingli() {
		return jingli;
	}


	public void setJingli(String jingli) {
		this.jingli = jingli;
	}


	public String getJingli_lianxi() {
		return jingli_lianxi;
	}


	public void setJingli_lianxi(String jingli_lianxi) {
		this.jingli_lianxi = jingli_lianxi;
	}


	public String getLianxiren() {
		return lianxiren;
	}


	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}


	public String getZhiwu() {
		return zhiwu;
	}


	public void setZhiwu(String zhiwu) {
		this.zhiwu = zhiwu;
	}


	public String getXuqiu() {
		return xuqiu;
	}


	public void setXuqiu(String xuqiu) {
		this.xuqiu = xuqiu;
	}


	public String getGongsiurl() {
		return gongsiurl;
	}


	public void setGongsiurl(String gongsiurl) {
		this.gongsiurl = gongsiurl;
	}


	public String getDizhi() {
		return dizhi;
	}


	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}


	@Override
	public String execute() throws Exception {
		ArrayList<CompanyModel> list=new CompanyAgent().selectCompany(gongsiname, "");
		CompanyModel m=list.get(0);
		this.setJingli(m.getJingli());
		this.setJingli_lianxi(m.getJingli_lianxi());
		this.setLianxiren(m.getLianxiren());
		this.setZhiwu(m.getZhiwu());
		this.setXuqiu(m.getZhiwu());
		this.setGongsiurl(m.getGongsiurl());
		this.setDizhi(m.getDizhi());
		
		return this.OK;
	}

}
