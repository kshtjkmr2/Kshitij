package Static_Inner;

public class StaticInnerDemo2 implements InterfaceInsideInterface.Inner,InterfaceInsideInterface{

	public static void main(String[] args) {
		StaticInnerDemo2 dm=new StaticInnerDemo2();
		dm.display();
		dm.show();

	}

	@Override
	public void display() {
		System.out.println("Outer Interface");
		
	}

	@Override
	public void show() {
		System.out.println("Inner interface");
		
	}
	

}
