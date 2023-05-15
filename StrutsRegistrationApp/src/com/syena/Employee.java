package com.syena;

public class Employee {
	
	private String eid;
	private String ename;
	private String eemail;
	private String emobile;
	
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	public String getEmobile() {
		return emobile;
	}
	public void setEmobile(String emobile) {
		this.emobile = emobile;
	}
	public Employee(String eid, String ename, String eemail, String emobile) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eemail = eemail;
		this.emobile = emobile;
	}
	public Employee() {

	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eemail=" + eemail + ", emobile=" + emobile + "]";
	}
}
