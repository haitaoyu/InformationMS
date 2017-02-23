package request;

import model.CompanyModel;
import agent.CompanyAgent;
import requestHome.Action_I;

public class CompanyRegist implements Action_I {
	  private String gongsiname;
	    private String jingli;
	    private String jingli_lianxi;
	    private String lianxiren;
	    private String zhiwu;
	    private String tel1;
	    private String tel2;
	    private String phone;
	    private String email;
	    private String xuqiu;
	    private String gongsiurl;
	    private String dizhi;
	    private String gongsijianjie;
	    
	public String getGongsiname() {
			return gongsiname;
		}

		public void setGongsiname(String gongsiname) {
			this.gongsiname = gongsiname;
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

		public String getTel1() {
			return tel1;
		}

		public void setTel1(String tel1) {
			this.tel1 = tel1;
		}

		public String getTel2() {
			return tel2;
		}

		public void setTel2(String tel2) {
			this.tel2 = tel2;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
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

		public String getGongsijianjie() {
			return gongsijianjie;
		}

		public void setGongsijianjie(String gongsijianjie) {
			this.gongsijianjie = gongsijianjie;
		}

	@Override
	public String execute() throws Exception {
		CompanyModel company=new CompanyModel();
		company.setGongsiname(gongsiname);
		company.setJingli(jingli);
		company.setJingli_lianxi(jingli_lianxi);
		company.setLianxiren(lianxiren);
		company.setZhiwu(zhiwu);
		company.setTel1(tel1);
		company.setPhone(phone);
		company.setEmail(email);
		company.setXuqiu(xuqiu);
		company.setGongsiurl(gongsiurl);
		company.setDizhi(dizhi);
		company.setGongsijianjie(gongsijianjie);
		
		new CompanyAgent().AddCompany(company);
		return this.OK;
	}

}
