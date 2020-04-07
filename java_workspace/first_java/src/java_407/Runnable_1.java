package java_407;

class RunnableTest_1 implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 20; i++ ) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(i + "¹ø : " + i + " * " + i + " = " + (i * i));
		}
	}
}

public class Runnable_1 {
	public static void main(String[] args) {
		
		RunnableTest_1 runn = new RunnableTest_1();
		Thread thread = new Thread(runn);
		
		thread.start();
		
	}
}
