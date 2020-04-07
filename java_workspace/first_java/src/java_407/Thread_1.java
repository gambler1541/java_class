package java_407;


class Thread_Exe extends Thread {
	
	public void run() {
		
		try {
			for (int i = 0; i < 20; i++) {
				Thread.sleep(1000);			// sleep�޼ҵ带 �������ؼ� �ݵ�� try~catch(����ó��)�� �������
				System.out.println(i + " ��: " + i + " * " + i +" = " + (i * i));
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
//		thread.run();	=> �޼ҵ� ȣ�� 	  start()=>������ ȣ��
	}
}
