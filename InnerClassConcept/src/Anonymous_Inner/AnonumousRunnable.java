package Anonymous_Inner;

public class AnonumousRunnable {

	public static void main(String[] args) {
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Anonymous runable thread");
				}
				
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main thread");
		}

	}

}
