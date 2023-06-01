package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private static Connection con;
	
	static {
		try{
			Class.forName("oracle.jdbc.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws Exception {
		con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.10.230:1521:orcl", "training", "training");
		return con;
	}

}
