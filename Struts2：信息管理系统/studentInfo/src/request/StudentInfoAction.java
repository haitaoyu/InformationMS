package request;

import java.util.ArrayList;

import model.StudentModel;
import requestHome.Action_I;
import agent.StudentAgent;
import antlr.collections.List;

public class StudentInfoAction implements Action_I{
	private ArrayList<StudentModel> list;
	public ArrayList<StudentModel> getList() {
		return list;
	}
	public void setList(ArrayList<StudentModel> list) {
		this.list = list;
	}

	public String execute() throws Exception {
		this.setList(new StudentAgent().selectAllStudent());
		return this.OK;
		
	}

}
