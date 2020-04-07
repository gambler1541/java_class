package java_407;

class Runnable2_1 implements Runnable{
	
	String str;
	
	public Runnable2_1(String str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		try {
			
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				System.out.println(i + " �� " + this.str + " ������ ");
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	
}

public class Runnable_2 { 
	public static void main(String[] args) {
		
		Runnable2_1 obj1 = new Runnable2_1("ù ��°");
		Thread thread1 = new Thread(obj1);
		Runnable2_1 obj2 = new Runnable2_1("�ε� ��°");
		Thread thread2 = new Thread(obj2);
		Runnable2_1 obj3 = new Runnable2_1("������ ��°");
		Thread thread3 = new Thread(obj3);
		Runnable2_1 obj4 = new Runnable2_1("�׳׳׳� ��°");
		Thread thread4 = new Thread(obj4);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	}
}
