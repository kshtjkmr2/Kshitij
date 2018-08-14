package crudoperation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectPerticularColm {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			con = JDBCUtil.getOracleConnection();
			st = con.createStatement();
			String qString = "select eno,ename, mobileno from employee";
			ResultSet rs = st.executeQuery(qString);
			boolean flag = true;
			System.out.println(" ID...Name......Mobile");
			System.out.println("======================");
			while(rs.next()) {
				flag =true;
				int id = rs.getInt(1);
				String name = rs.getString(2);				
				long mobile = rs.getLong(3);
				
				
				System.out.println(id+"....."+name+"..... "+mobile);
				System.out.println("------------------------------");
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
