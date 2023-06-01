package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import dao.ProductDao;
import model.Product;

public class ProductController {
	
	private String eid,ename,eemail,emobile;

	Product product = new Product();
	ProductDao dao = new ProductDao();
	private List<Product> productList;
	private String sm = "";
	private String em = "";
	
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
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public ProductDao getDao() {
		return dao;
	}
	public void setDao(ProductDao dao) {
		this.dao = dao;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	public String getSm() {
		return sm;
	}
	public void setSm(String sm) {
		this.sm = sm;
	}
	public String getEm() {
		return em;
	}
	public void setEm(String em) {
		this.em = em;
	}

	public String saveProduct() throws Exception {
	
		product.setEid(eid);
		product.setEname(ename);
		product.setEemail(eemail);
		product.setEmobile(emobile);
		
		boolean status = dao.saveProduct(product);

		if(status){
			setSm("Employee saved or updated successfully");
			return "success";
		} else {
			setEm("Employee not saved or not updated");
			return "failure";
		}
	}
	public String updateProduct() throws Exception {
		
		product.setEid(product.getEid());
		product.setEname(product.getEname());
		product.setEemail(product.getEemail());
		product.setEmobile(product.getEmobile());
		
		boolean status = dao.updateProduct(product);

		if(status){
			setSm("Employee updated successfully");
			return "success";
		} else {
			setEm("Employee not updated");
			return "failure";
		}
	}
	
	
	public String findAllProducts() throws Exception {
		productList = dao.getAllProducts();
		return "success";
	}
	
	public  String editProduct() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		String eid = request.getParameter("eid");
		
		Product p = dao.getProduct(eid);
		
//		product.setEid(eid);
//		product.setEname(ename);
//		product.setEemail(eemail);
//		product.setEmobile(emobile);
		
		System.out.println(product.getEid());
		
		product.setEid(p.getEid());
		product.setEname(p.getEname());
		product.setEemail(p.getEemail());
		product.setEmobile(p.getEmobile());
		
		return "success";
	}
	
	public  String deleteProduct() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		String eid = request.getParameter("eid");
		
		boolean status = dao.deleteProduct(eid);
		
		if(status){
			setSm("product deleted successfully");
			findAllProducts();
			return "success";
		} else {
			setEm("product not deleted");
			return "input";
		}
	}
}
