package crudoperation;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCUtil {
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static Connection getOracleConnection()throws IOException {
		Connection con = null;
		Properties p = new Properties();
		FileInputStream fis=new FileInputStream("oracledatabase.properties");
		
		p.load(fis);
		
		String url = p.getProperty("url");
		String user = p.getProperty("username");
		String password = p.getProperty("password");
		try {
			con=DriverManager.getConnection(url, user, password);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
				
		return con;
	}

}
