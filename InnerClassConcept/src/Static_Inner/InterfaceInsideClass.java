package Static_Inner;

public class InterfaceInsideClass {
	
	interface Vechel{
		public  void getNoOfWheels();
	}
	static class Bus implements Vechel{

		@Override
		public void getNoOfWheels() {
			System.out.println("6");
			
		}
		
	}
	static class Auto implements Vechel{
		@Override
		public void getNoOfWheels() {
			System.out.println("3");
			
		}
	}

	public static void main(String[] args) {
		Auto a=new Auto();
		a.getNoOfWheels();
		Bus b=new Bus();
		b.getNoOfWheels();

	}

}
