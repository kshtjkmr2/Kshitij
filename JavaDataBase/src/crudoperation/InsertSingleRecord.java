package crudoperation;

import java.sql.Connection;
import java.sql.Statement;

public class InsertSingleRecord {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null; 
		try {
			con=JDBCUtil.getOracleConnection();
			String query = "insert into student values(103,'Anup','anup2@gmail.com',78,'Chandauli',8762523453)";
			st=con.createStatement();
			int res=st.executeUpdate(query);
			if(res!=0){
				System.out.println("Data inserted");
			}
			
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
