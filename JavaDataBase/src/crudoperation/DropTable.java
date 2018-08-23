package crudoperation;

import java.sql.Connection;
import java.sql.Statement;

public class DropTable {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			con = JDBCUtil.getOracleConnection();
			String qString = "drop table employees";
			st = con.createStatement();
			int res = st.executeUpdate(qString);
			if(res!=0)
				System.out.println("table deleted");
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
