package crudoperation;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try 
		{
			con=JDBCUtil.getOracleConnection();
			String query = "create table student(rollNo number(10),name varchar2(20),email varchar2(20),marks number(3),"
					+ "address varchar2(20),mobileno number(10))";
			st=con.createStatement();
			int row_affected=st.executeUpdate(query);
			System.out.println(row_affected+" Table created Successfully");
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(con!=null) {con.close();}
				if(st!=null) {st.close();}
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		

	}

}
