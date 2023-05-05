package com.syena;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateAction extends ActionSupport {
	
	Employee e2;
	
	public Employee getE2() {
		return e2;
	}
	public void setE2(Employee e2) {
		this.e2 = e2;
	}

	public String execute() throws Exception {
		String status = "";
		
		EmployeeService es = new EmployeeService();
		status = es.update(e2);
		
		return status;
	}
}
