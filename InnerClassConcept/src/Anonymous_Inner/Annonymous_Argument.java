package Anonymous_Inner;

public class Annonymous_Argument {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Anonymous runable argument thread");
				}
				
			}
		}).start();
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}

	}

}
