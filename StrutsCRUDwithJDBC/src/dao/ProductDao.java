package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Product;
import util.DBConnect;

public class ProductDao {

	public List<Product> getAllProducts() throws Exception {
		List<Product> list = new ArrayList<>();

		String sql = "select * from emp";
		try {
			ResultSet rs = DBConnect.getConnection().createStatement().executeQuery(sql);
			while(rs.next()) {
				list.add(new Product(rs.getString("eid"),rs.getString("ename"),rs.getString("eemail"),rs.getString("emobile")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public boolean saveProduct(Product p) throws Exception {
		String sql = "insert into emp(eid,ename,eemail,emobile) values (?,?,?,?)";
		
			PreparedStatement pst = DBConnect.getConnection().prepareStatement(sql);
			pst.setString(1, p.getEid());
			pst.setString(2, p.getEname());
			pst.setString(3, p.getEemail());
			pst.setString(4, p.getEmobile());
			
			int value = pst.executeUpdate();
			if(value > 0) {
				return true;
			}else {
				return false;
			}
	}
	
	public boolean updateProduct(Product p) {
		String sql = "update product set ename = ?, eemail = ?, emobile = ? where eid = ?";
		
		try {
			PreparedStatement pst = DBConnect.getConnection().prepareStatement(sql);
			pst.setString(1, p.getEname());
			pst.setString(2, p.getEemail());
			pst.setString(3, p.getEmobile());
			pst.setString(4, p.getEid());
			
			int value = pst.executeUpdate();
			if(value > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean deleteProduct(String eid) {
		String sql = "delete from emp where eid = ?";
		
		try {
			PreparedStatement pst = DBConnect.getConnection().prepareStatement(sql);
			pst.setString(1, eid);
			
			int value = pst.executeUpdate();
			if(value > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public Product getProduct(String eid) throws Exception {
		Product p = new Product();
		String sql = "select * from emp where eid ="+eid;
		
		ResultSet rs = DBConnect.getConnection().createStatement().executeQuery(sql);
		if(rs.next()) {
			p.setEid(rs.getString("eid"));
			p.setEname(rs.getString("ename"));
			p.setEemail(rs.getString("eemail"));
			p.setEmobile(rs.getString("emobile"));
		}
		return p;
	}
}
