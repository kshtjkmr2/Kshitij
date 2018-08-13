package Normal_Regular;

public class OuterInnerDemo2 {
	//Accessing inner class from instance area of outer class
	class Inner{
		public void method1() {
			System.out.println("Inner class method");
		}
	}

	public static void main(String[] args) {
		OuterInnerDemo2 outer=new OuterInnerDemo2();
		outer.method2();
	}
	public void method2() {
		Inner in=new Inner();
		in.method1();
	}

}
