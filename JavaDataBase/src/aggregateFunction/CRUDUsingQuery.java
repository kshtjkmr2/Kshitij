package aggregateFunction;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import crudoperation.JDBCUtil;

public class CRUDUsingQuery {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			con = JDBCUtil.getOracleConnection();
			st = con.createStatement();
			System.out.println("Enter Query");
			Scanner sc = new Scanner(System.in);
			String qString = sc.nextLine();
			boolean res = st.execute(qString);
			if(res==true) {
				ResultSet rs = st.getResultSet();
				while(rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String mail = rs.getString(3);
					long mobile = rs.getLong(4);
					String address = rs.getString(5);
					double sal = rs.getDouble(6);
					
					System.out.println(id+"....."+name+"....."+mail+"..... "+mobile+".... "+address+"..... "+sal);
				}
			}
			else {
				int count = st.getUpdateCount();
				System.out.println(count);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}

	}

}
