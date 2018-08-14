package crudoperation;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Scanner;

public class InsertMultipleRecord {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		
		try {
			con = JDBCUtil.getOracleConnection();
			st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.println("Enter Employee id");
				int eno = sc.nextInt();
				System.out.println("Enter Employee Name");
				String name = sc.next();
				System.out.println("Enter Email address");
				String email = sc.next();
				System.out.println("Inter mobile no");
				Double mob =sc.nextDouble();
				System.out.println("Enter Address");
				String address = sc.next();
				System.out.println("Enter Sallary");
				double sal = sc.nextDouble();
			    
				String qString = String.format("insert into employee values(%d,'%s','%s',%f,'%s',%f)", eno,name,email,mob,address,sal);
				st.executeUpdate(qString);
				System.out.println("Successful");
				System.out.println("Are you insertion more");
				String res = sc.next();
				if(res.equalsIgnoreCase("No")) {
					break;
				}
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
