package com.syena;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {
	private String uname;
	private String upwd;
	private String errorMsg="";

	public String getErrorMsg() {
		return errorMsg;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	@Override
	public String execute() throws Exception {
		String status = "";
		if(uname.equals("syena") && upwd.equals("syena123")){
			status = SUCCESS;
			errorMsg = "";
		} else {
			errorMsg = "Incorrect User Name and Password";
			status = ERROR;
		}
		return status;
	}
}