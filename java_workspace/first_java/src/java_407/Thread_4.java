package java_407;

class Thread_Exe_4 extends Thread {
	
	public Thread_Exe_4(String name) {
		super(name);
	}
	
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + " ������~");
		}
	}
	
}


public class Thread_4 {
	public static void main(String[] args) {
		
		Thread_Exe_4 obj1 = new Thread_Exe_4("�ְ� �켱 ����");
		Thread_Exe_4 obj2 = new Thread_Exe_4("������ �켱 ����");
		Thread_Exe_4 obj3 = new Thread_Exe_4("�������� �켱 ����");

		obj1.setPriority(10);
		obj2.setPriority(7);
		obj3.setPriority(1);
		
		
		obj3.start();
		obj2.start();
		obj1.start();
		
		
	}
}
