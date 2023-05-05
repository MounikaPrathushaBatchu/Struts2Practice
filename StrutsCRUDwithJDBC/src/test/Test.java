package test;

import dao.ProductDao;

public class Test {

	public static void main(String[] args) throws Exception {
		ProductDao dao = new ProductDao();
		System.out.println(dao.getAllProducts());
	}
}
