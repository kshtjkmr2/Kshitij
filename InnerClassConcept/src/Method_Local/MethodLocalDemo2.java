package Method_Local;

public class MethodLocalDemo2 {
	int x=10;
	static int y=20;
	public void method1() {
		//int x=30;
		
		class Inner{
			//int x=30;
			public void display() {
				System.out.println("Outer instance variable access method inner class X= "+x);
				System.out.println("Outer static variable access method inner class Y= "+y);
			}
		}
		Inner in=new Inner();
		in.display();
	}
	public static void method2() {
		//int x=30;
		
		class Inner{
			//int x=30;
			public void display() {
				//we can't access instance member
				//System.out.println("Outer instance variable access method inner class X= "+x);
				System.out.println("Outer static variable access method inner class Y= "+y);
			}
		}
		Inner in=new Inner();
		in.display();
	}

	public static void main(String[] args) {
		MethodLocalDemo2 outer=new MethodLocalDemo2();
		outer.method1();
		method2();

	}

}
