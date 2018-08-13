package Static_Inner;

public class ClassInsideClass {
	static int x=10;
	int y=20;
	static class Inner{
		public static void display() {
			System.out.println(x);
			//instence member not accessable
			//System.out.println(y);
		}
	}

	public static void main(String[] args) {
		Inner in=new Inner();
		in.display();

	}

}
