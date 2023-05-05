package com.syena;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport {
	
	Employee e3;
	
	public Employee getE3() {
		return e3;
	}
	public void setE3(Employee e3) {
		this.e3 = e3;
	}

	public String execute() {
		String status = "";
		
		EmployeeService es = new EmployeeService();
		status = es.delete(e3);
		
		return status;
	}
}
