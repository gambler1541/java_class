package java_403;


class A_9{
	
//	final void display() {			// final �޼ҵ�� �ڽ�Ŭ�������� �������̵� �Ҽ�����.
	void display() {
		System.out.println("������ �Ұ� �޼ҵ� ~~~~");
	}
}

class B_9 extends A_9{
	
	void display() {
		System.out.println("������");
	}
}


public class Finalmethod {
	public static void main(String[] args) {
		
		B_9 obj = new B_9();
		
		obj.display();
	}
}
