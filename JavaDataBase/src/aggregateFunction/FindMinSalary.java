package aggregateFunction;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import crudoperation.JDBCUtil;

public class FindMinSalary {

	public static void main(String[] args) {
		Connection con =null;
		Statement st = null;
		try {
			con = JDBCUtil.getOracleConnection();
			st = con.createStatement();
			String qString = "select * from employee where sal in(select min(sal) from employee)";
			ResultSet rs = st.executeQuery(qString);
			while(rs.next()) {
				System.out.println("Higest salary employee info");
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String mail = rs.getString(3);
				long mobile = rs.getLong(4);
				String address = rs.getString(5);
				double sal = rs.getDouble(6);
				
				System.out.println(id+"....."+name+"....."+mail+"..... "+mobile+".... "+address+"..... "+sal);
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
