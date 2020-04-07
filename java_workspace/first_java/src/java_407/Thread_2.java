package java_407;

class Thread_Exe_2 extends Thread{

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


public class Thread_2 {
	public static void main(String[] args) {


		Thread_Exe_2 thread = new Thread_Exe_2();
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
