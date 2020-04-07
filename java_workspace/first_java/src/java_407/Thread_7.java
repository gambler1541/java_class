package java_407;

import javax.swing.JOptionPane;

public class Thread_7 {
	public static void main(String[] args) throws Exception {
	
		MyThread_1 thread_1 = new MyThread_1();
		thread_1.start();
		
		String input = JOptionPane.showInputDialog("값 입력!!");
		System.out.println("입력한 값: " +  input + " 입니다.!!");
	}
}

class MyThread_1 extends Thread {
	
	public void run() {
		
		for (int i = 10; i < 0; i--) {
			System.out.println("\t\t" + i);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
}
