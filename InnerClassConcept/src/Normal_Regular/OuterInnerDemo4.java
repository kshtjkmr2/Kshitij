package Normal_Regular;

public class OuterInnerDemo4 {
	//Accessing outer class member in inner class
	int x=10;
	static int y=20;
	class Inner{
		public void method1() {
			System.out.println("from normal Inner class accesing member of outer class");
			System.out.println("instance member X= "+x);
			System.out.println("Static member Y= "+y);
		}
	}
     //from normal inner class we can access both static and instance member of outer class
	public static void main(String[] args) {
		OuterInnerDemo4 o=new OuterInnerDemo4();
		OuterInnerDemo4.Inner in=o.new Inner();
		in.method1();

	}

}
