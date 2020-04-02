package java_402;


class A_7 {
	
	int a = 10;
	
	void display() {
		
		System.out.println("aaaaa");
	}
}

class B_7 extends A_7{
	
	int b = 20;
	
	void display() {
		
		System.out.println("bbbbbb");
	}
}

class C_7 extends B_7{
	
	int a = 99;
	int c = 30;
	void display() {
		
		System.out.println("cccccc");
	}
}


public class Convert_1 {
	public static void main(String[] args) {
		
		C_7 obj = new C_7();
//		
//		System.out.println("a = " + obj.a);
//		System.out.println("b = " + obj.b);
//		System.out.println("c = " + obj.c);
		
		obj.display();
	}
}
