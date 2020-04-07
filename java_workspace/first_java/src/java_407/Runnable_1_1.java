package java_407;

class Runnable1_1_1 implements Runnable{

	public void run(){
		try {

			for (int i = 0; i < 20; i++) {
				Thread.sleep(1000);
				System.out.println(i + "번 스레드~~");
			}

		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}

	}

}

public class Runnable_1_1 {
	public static void main(String[] args) {


		Runnable1_1_1 runn = new Runnable1_1_1();
		Thread thread = new Thread(runn);
		
		thread.start();
		
		try {
			for (int i = 0; i < 20; i++) {
				
				Thread.sleep(1000);
				System.out.println(i + " 번 main() 메소드^^^ ");
			}

		}
		catch (InterruptedException e) {
			
			System.out.println(e.getMessage());
		}

	}
}
