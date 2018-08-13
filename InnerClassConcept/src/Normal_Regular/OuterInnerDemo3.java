package Normal_Regular;

public class OuterInnerDemo3 {
	//Accessing inner class from outside of outer class
	class Inner{
		public void method1() {
			System.out.println("Inner class method");
		}
	}

	public static void main(String[] args) {
		OuterInnerDemo3 outer=new OuterInnerDemo3();
		outer.method2();

	}
	public void method2() {
		Inner in=new Inner();
		in.method1();
	}

}
