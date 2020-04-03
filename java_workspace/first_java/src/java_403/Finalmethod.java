package java_403;


class A_9{
	
//	final void display() {			// final 메소드는 자식클래스에서 오버라이딩 할수없다.
	void display() {
		System.out.println("재정의 불가 메소드 ~~~~");
	}
}

class B_9 extends A_9{
	
	void display() {
		System.out.println("재정의");
	}
}


public class Finalmethod {
	public static void main(String[] args) {
		
		B_9 obj = new B_9();
		
		obj.display();
	}
}
