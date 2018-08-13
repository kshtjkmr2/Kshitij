package Normal_Regular;

public class NestingInnerDemo {
	
	class FirstInner{
		public void method1() {
			System.out.println("First level inner class");
		}
		
		class SecondInner{
			
			public void method2() {
				System.out.println("Second level inner class");
			}
		}
		
	}

	public static void main(String[] args) {
		NestingInnerDemo nested=new NestingInnerDemo();
		NestingInnerDemo.FirstInner finner=nested.new FirstInner();
		finner.method1();
		NestingInnerDemo.FirstInner.SecondInner sinner=finner.new SecondInner();
		sinner.method2();

	}

}
