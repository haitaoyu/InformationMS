package request;

import common.ChinaUnit;

import agent.StudentAgent;
import requestHome.Action_I;

public class StudentDelete implements Action_I {
	private String name;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = ChinaUnit.getChina(name);
	}


	@Override
	public String execute() throws Exception {
		new StudentAgent().deleteStudent(name);
		return this.SUCCESS;
	}

}
