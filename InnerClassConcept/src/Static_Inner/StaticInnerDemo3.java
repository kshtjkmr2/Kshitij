package Static_Inner;

public class StaticInnerDemo3 implements ClassInsideInterface {

	public static void main(String[] args) {
		StaticInnerDemo3 dm=new StaticInnerDemo3();
		dm.sendmail();
	

	}

	@Override
	public void sendmail() {		
		Inner in=new Inner("kshitij", "Anju");
		System.out.println("mail sent");
	}

}
