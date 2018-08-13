package Enumaration1_5Version;

public class EnumDemo4 {

	public static void main(String[] args) {
		
		Month[] m = Month.values();
		for(Month m1:m) {
			System.out.println(m1+"  "+m1.ordinal());
		}
		
		

	}

}
