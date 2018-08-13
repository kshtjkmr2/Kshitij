package Normal_Regular;

public class OuterInnerDemo1 {
	//Accessing inner class from static area of outer class
	class Inner{
		public void method1() {
			System.out.println("Inner class method");
		}
	}

	public static void main(String[] args) {
		OuterInnerDemo1 o=new OuterInnerDemo1();
		OuterInnerDemo1.Inner in=o.new Inner();
		in.method1();

	}

}
