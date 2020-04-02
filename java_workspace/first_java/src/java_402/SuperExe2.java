package java_402;

class A_4{
	
	int a;
	int b;
	
	public A_4(int a, int b) {
		
		this.a = a;
		this.b = b;
	}
	
	void display() {
		
		System.out.println("a = " + a + ", b = " + b);
	}
}


class B_4 extends A_4{
	
	int b2;
	public B_4(int a, int b) {
		
		super(a,b);
		super.display();
		this.b2 = b;
		
	}
}


public class SuperExe2 {
	public static void main(String[] args) {
		
		B_4 obj = new B_4(77,99);
		
		System.out.println("b2 = " + obj.b2);
	}
}
