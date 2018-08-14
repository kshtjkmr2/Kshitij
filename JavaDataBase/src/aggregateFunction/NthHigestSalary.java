package aggregateFunction;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import crudoperation.JDBCUtil;

public class NthHigestSalary {

	public static void main(String[] args) {
		Connection con =null;
		Statement st = null;
		try {
			con = JDBCUtil.getOracleConnection();
			st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ranking of salary");
			int n = sc.nextInt();
			String qString = "select * from (select eno,ename,email,mobileno,address,sal,rank()over(order by sal DESC)"
					+ "ranking from employee) where ranking="+n;
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
