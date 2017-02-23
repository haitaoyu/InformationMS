package request;

import agent.UserAgent;

import com.opensymphony.xwork2.ActionSupport;




import requestHome.Action_I;

public class IndexAction extends ActionSupport implements Action_I{
	//��������ǰ̨������ͬ
	private String username;
	private String password;
	private String errorMessage;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	

	
	public String execute() throws Exception {
		Boolean b=new UserAgent().selectPassword(getUsername(), getPassword());	
		if (b) {
			return this.OK;
		}else {
			this.setErrorMessage("��������ȷ�����������룡");
			return Action_I.INPUT;
		}
	}
	
	
}
