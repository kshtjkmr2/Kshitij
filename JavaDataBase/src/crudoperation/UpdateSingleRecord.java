package crudoperation;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateSingleRecord {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			con = JDBCUtil.getOracleConnection();
			st = con.createStatement();
			String qString = "update employee set sal=3000 where eno=101";
			int res = st.executeUpdate(qString);
			System.out.println(res + "row updated");
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
