package crudoperation;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteSingleRecord {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		
		try {
			con = JDBCUtil.getOracleConnection();
			st = con.createStatement();
			String qString = "delete from employee where sal < 6000";
			int res = st.executeUpdate(qString);
			System.out.println(res +" deleted");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(st != null) {st.close();}
				if(con != null) {con.close();}
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
