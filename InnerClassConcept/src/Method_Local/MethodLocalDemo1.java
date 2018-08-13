package Method_Local;

public class MethodLocalDemo1 {
	//instance method
	public void sumOfInteger() {
		//inner class inside instance method
		class Inner {
			int x;
			int y;
			public Inner(int x,int y) {
				this.x=x;
				this.y=y;
			}
			
			public  void sum() {
				int sum=x+y;
				System.out.println("Sum of two numbers is= "+sum);
			}
			
		}
		Inner in=new Inner(10,20);
		in.sum();
		Inner in2=new Inner(100,200);
		in2.sum();
		Inner in3=new Inner(110,210);
		in3.sum();
	}
	//static method
public  static void ProductOfInteger() {
		//inner class inside static method
		class Inner {
			int x;
			int y;
			public Inner(int x,int y) {
				this.x=x;
				this.y=y;
			}
			
			public  void calculator() {
				int sum=x*y;
				System.out.println("Product of two numbers is= "+sum);
			}
			
		}
		Inner in=new Inner(10,20);
		in.calculator();
		Inner in2=new Inner(100,200);
		in2.calculator();
		Inner in3=new Inner(110,210);
		in3.calculator();
	}

	public static void main(String[] args) {
		MethodLocalDemo1 outer=new MethodLocalDemo1();
		outer.sumOfInteger();
		ProductOfInteger();

	}

}
