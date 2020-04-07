package java_407;

import javax.swing.JOptionPane;

public class Thread_7 {
	public static void main(String[] args) throws Exception {
	
		MyThread_1 thread_1 = new MyThread_1();
		thread_1.start();
		
		String input = JOptionPane.showInputDialog("�� �Է�!!");
		System.out.println("�Է��� ��: " +  input + " �Դϴ�.!!");
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
