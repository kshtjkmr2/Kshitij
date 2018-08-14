package crudoperation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectBasedOnColm {
		
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			con = JDBCUtil.getOracleConnection();
			st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Address of employee");
			String addr = sc.next();
			String qString = String.format("select * from employee where address = '%s'",addr);
			ResultSet rs = st.executeQuery(qString);
			boolean flag = true;
			System.out.println(" ID...Name..... Email.....Mobile.......Address.......salary");
			System.out.println("=============================================================");
			while(rs.next()) {
				flag =true;
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String mail = rs.getString(3);
				long mobile = rs.getLong(4);
				String address = rs.getString(5);
				double sal = rs.getDouble(6);
				
				System.out.println(id+"....."+name+"....."+mail+"..... "+mobile+".... "+address+"..... "+sal);
				System.out.println("------------------------------------------------------------------------");
			}
			if(flag == false)
				System.out.println("No record found");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(st !=null) st.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}


	}

}
