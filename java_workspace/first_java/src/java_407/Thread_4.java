package java_407;

class Thread_Exe_4 extends Thread {
	
	public Thread_Exe_4(String name) {
		super(name);
	}
	
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + " 스레드~");
		}
	}
	
}


public class Thread_4 {
	public static void main(String[] args) {
		
		Thread_Exe_4 obj1 = new Thread_Exe_4("최고 우선 순위");
		Thread_Exe_4 obj2 = new Thread_Exe_4("보보통 우선 순위");
		Thread_Exe_4 obj3 = new Thread_Exe_4("최저저저 우선 순위");

		obj1.setPriority(Thread.MAX_PRIORITY);
		obj2.setPriority(Thread.NORM_PRIORITY);
		obj3.setPriority(Thread.MIN_PRIORITY);
		
		
		obj3.start();
		obj2.start();
		obj1.start();
		
		
	}
}
