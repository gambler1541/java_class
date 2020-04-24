package practice_421;

public class Function_1 {
	static void add(int a, long b) {
		System.out.println("int a long b");
	}
	
	static void add(long a, int b) {
		System.out.println("long a int b");
	}
	static void add(int a, int b) {
		System.out.println("int a int b");
	}

	public static void main(String[] args) {
		add(10,10L);
		add(20,20);
	}
}
