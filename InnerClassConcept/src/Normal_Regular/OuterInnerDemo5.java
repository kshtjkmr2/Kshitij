package Normal_Regular;

public class OuterInnerDemo5 {
	//Accessing inner class from static area of outer class
	int x=10;
	static int y=20;
	class Inner{
		int x=100;
		//static int y2=200;can't declare static member
		public void method1() {
			int x=1000;
			//static int y1=300;can't declare static member
			System.out.println("First prifrence inner method member "+x);
			System.out.println("Second prifrence inner classd member "+this.x);
			System.out.println("Third prifrence Outer classd member "+OuterInnerDemo5.this.x);
		}
	}

	public static void main(String[] args) {
		OuterInnerDemo5 o=new OuterInnerDemo5();
		OuterInnerDemo5.Inner in=o.new Inner();
		in.method1();

	}

}
