package com.syena;

import com.opensymphony.xwork2.ActionSupport;

public class RegistrationAction extends ActionSupport {
	
	Employee e1;
	
	public Employee getE1() {
		return e1;
	}
	public void setE1(Employee e1) {
		this.e1 = e1;
	}
	
	public String execute() throws Exception {
		String status = "";
		
		EmployeeService es = new EmployeeService();
		status = es.registration(getE1());
		
		return status;
	}
}
