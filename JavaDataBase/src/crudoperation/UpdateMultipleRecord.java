package crudoperation;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateMultipleRecord {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			con = JDBCUtil.getOracleConnection();
			st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter bonus");
			double bonus = sc.nextDouble();
			System.out.println("Enter Salary range");
			double range = sc.nextDouble();
			String qString = String.format("update employee set sal=sal+%f where sal<=%f",bonus,range);
			int count = st.executeUpdate(qString);
			System.out.println(count +" row updated");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(st!=null) {st.close();}
				if(con!=null) {con.close();}
				
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}

	}

}
