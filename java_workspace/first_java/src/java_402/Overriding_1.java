package java_402;

class A_2{
	
	
	void display() {
		
		System.out.println("A_2 class display()~~~~");
	}
	
}

class B_2 extends A_2{
	
	
	void display() {
		
		System.out.println("B_2 class display()~~~~~");
	}
	
}


public class Overriding_1 {
	public static void main(String[] args) {
		
		A_2 a2 = new A_2();
		B_2 b2 = new B_2();		// A_2 b2 = new B_2() member ������ shadowing , �޼���� overriding �ȴ�.
								// 					    ������ A�� �޼���� B���� ����
		
		a2.display();
		b2.display();
		
	}
}
