package Anonymous_Inner;

public class AnonymousThread {

	public static void main(String[] args) {
		//Anonymous thread which extend Thread class
		Thread t=new Thread() {
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Anonymus child thread");
				}
			}
		};
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}

	}

}
