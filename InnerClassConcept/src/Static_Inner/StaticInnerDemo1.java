package Static_Inner;

public class StaticInnerDemo1 {
	
	static class Inner{
		public void display() {
			System.out.println("In Display method");
		}
		public static void main(String[] args) {
			System.out.println("Inner class main");
		}
	}

	public static void main(String[] args) {
		Inner in=new Inner();
		in.display();
		System.out.println("Outer class main");

	}

}
