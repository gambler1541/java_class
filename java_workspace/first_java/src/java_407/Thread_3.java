package java_407;

class Thread_Exe_3 extends Thread{
	
	public Thread_Exe_3(String str) {
		super(str);
	}
	
	@Override
	public void run() {
	
		try {
			
			for (int i = 0; i < 5; i++) {
				
				Thread.sleep(1000);
				System.out.println(i + " �� " + getName() + " ������ ");
			}
			
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}
	}
	
}


public class Thread_3 { 
	public static void main(String[] args) {
		
		Thread_Exe_3 obj1 = new Thread_Exe_3("ù ��°");
		Thread_Exe_3 obj2 = new Thread_Exe_3("�ε� ��°");
		Thread_Exe_3 obj3 = new Thread_Exe_3("������ ��°");
		Thread_Exe_3 obj4 = new Thread_Exe_3("�׳׳׳� ��°");
		
		
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		
	}
}
