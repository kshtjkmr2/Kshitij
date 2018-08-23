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
			String query = "create table employees(eno number(10),ename varchar2(20),"
					+ "email varchar2(20),mobileno number(10),address varchar2(20),sal number )";
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
