package crudoperation;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteMultipleRecord {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			con = JDBCUtil.getOracleConnection();
			st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Eneter cutoff salary");
			double max = sc.nextDouble();
			String qString = String.format("delete from employee where sal > %f",max);
			int res = st.executeUpdate(qString);
			System.out.println(res +" row deleted");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				System.out.println(e2.getCause());
			}
		}

	}

}
