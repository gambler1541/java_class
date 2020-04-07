package java_407;


class Thread_Exe extends Thread {
	
	public void run() {
		
		try {
			for (int i = 0; i < 20; i++) {
				Thread.sleep(1000);			// sleep메소드를 쓰기위해선 반드시 try~catch(예외처리)를 해줘야함
				System.out.println(i + " 번: " + i + " * " + i +" = " + (i * i));
			}
			
		} catch (InterruptedException e) {
			
			System.out.println(e.getMessage());
		}
	}
	
}




public class Thread_1 {
	public static void main(String[] args) {
		
		Thread_Exe thread = new Thread_Exe();
		thread.start();	
//		thread.run();	=> 메소드 호출 	  start()=>스레드 호출
	}
}
