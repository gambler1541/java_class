package java_407;

class Runnable_3_1 implements Runnable{
	
	String str;
	
	public Runnable_3_1(String str) {
		this.str = str;
	}
	
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(this.str + " 스레드~");
		}
	}
	
}


public class Runnable_3 {
	public static void main(String[] args) {
		
		Runnable_3_1 obj1 = new Runnable_3_1("최고 우선 순위");
		Thread thread1 = new Thread(obj1);
		Runnable_3_1 obj2 = new Runnable_3_1("보보통 우선 순위");
		Thread thread2 = new Thread(obj2);
		Runnable_3_1 obj3 = new Runnable_3_1("최저저저 우선 순위");
		Thread thread3 = new Thread(obj3);

		thread1.setPriority(10);
		thread2.setPriority(7);
		thread3.setPriority(3);
	
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
	}
}
