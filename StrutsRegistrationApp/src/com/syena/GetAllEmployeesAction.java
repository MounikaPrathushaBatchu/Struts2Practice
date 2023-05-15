package com.syena;

import com.opensymphony.xwork2.ActionSupport;

public class GetAllEmployeesAction extends ActionSupport {
	
	Employee e4;

	public Employee getE4() {
		return e4;
	}
	public void setE4(Employee e4) {
		this.e4 = e4;
	}
	
	public String execute() throws Exception {
		String status = "";
		
		EmployeeService es = new EmployeeService();
		es.getAllEmployees();

		return status;
		
	}

}
