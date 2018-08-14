package aggregateFunction;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import crudoperation.JDBCUtil;

public class CountNoOfRows {

	public static void main(String[] args) {
		
		Connection con =null;
		Statement st = null;
		try {
			con = JDBCUtil.getOracleConnection();
			st = con.createStatement();
			String qString = "select count(*) from employee";
			ResultSet rs = st.executeQuery(qString);
			while(rs.next()) {
				System.out.println(rs.getInt(1));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}

	}

}
