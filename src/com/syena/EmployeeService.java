package com.syena;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	String status = "";

	public EmployeeService() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.10.230:1521:orcl", "training", "training");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public String registration(Employee e1) {
		try {
			String sql = "select * from emp where eid = '"+e1.getEid()+"'";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			if(rs.next()) {
				status = "existed";
				System.out.println("existed");
			} else {
				pst.executeUpdate("insert into emp(eid,ename,eemail,emobile) values(?,?,?,?)");
				pst.setString(1, e1.getEid());
				pst.setString(2, e1.getEname());
				pst.setString(3, e1.getEemail());
				pst.setString(4, e1.getEmobile());
				pst.executeUpdate();
				status = "success";
				System.out.println("success");
			}
		} catch (SQLException e) {
			status = "failure";
			System.out.println("fail");
			e.printStackTrace();
		}
		return status;
	}

	public String update(Employee e1) {
		try {
//			String sql = "select * from emp where eid = eid";
//			pst = con.prepareStatement(sql);
//			rs = pst.executeQuery(sql);
			pst = con.prepareStatement("select * from emp where eid = '"+e1.getEid()+"'");
			rs = pst.executeQuery();
			boolean b = rs.next();
			if(b == true) {
				pst.executeUpdate("update emp set ename = ?, eemail = ?, emobile = ? where eid = ?");
				pst.setString(1, e1.getEname());
				pst.setString(2, e1.getEemail());
				pst.setString(3, e1.getEmobile());
				pst.setString(4,e1.getEid());
				pst.executeUpdate();
				status = "success";
			}
		} catch(Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}

	public String delete(Employee e3) {
		try {
			rs = pst.executeQuery("select * from emp where eid = eid");
			boolean b = rs.next();
			if(b == true) {
				pst.executeUpdate("delete from emp where eid = eid");
				status = "success";
			}
		} catch(Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}
	
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<>();
		try {
			rs = pst.executeQuery("select * from emp");
			while(rs.next()) {
				list.add(new Employee(rs.getString("eid"),rs.getString("ename"),rs.getString("eemail"),rs.getString("emobile")));
			}
			status = "success";
		} catch (SQLException e) {
			status = "failure";
			e.printStackTrace();
		}
		return list;
	}
}
