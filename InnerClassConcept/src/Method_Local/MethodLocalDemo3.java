package Method_Local;

public class MethodLocalDemo3 {
	
	public void method1() {
		int x=10;
		System.out.println(x);
		class Inner{
			
			public void display() {
				System.out.println(x);
			}
		}
		Inner in=new Inner();
		in.display();
	}

	public static void main(String[] args) {
		MethodLocalDemo3 outer=new MethodLocalDemo3();
		outer.method1();

	}

}
