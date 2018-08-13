package Anonymous_Inner;

public class AnonymusInnerDemo1 {

	public static void main(String[] args) {
		//Anonymous inner class
		PopCorn p1=new PopCorn() {
			@Override
			public void test() {
				System.out.println("Spycy");
			}
		};
		p1.test();
		//Popcorn object
		PopCorn p2=new PopCorn();
		p2.test();
		//Anonymous inner class
		PopCorn p3=new PopCorn() {
			@Override
			public void test() {
				System.out.println("Sweet");
			}
		};
		p3.test();

	}

}
