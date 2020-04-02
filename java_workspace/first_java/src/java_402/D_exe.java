package java_402;

class A_1{			// A_1 클래스
	
	int a = 11;		// A_1 클래스의 맴버 변수
	
}

class B_1 extends A_1{	// B_1 클래스
	
	int b = 33;			// B_1 클래스의 멤버 변수

}

class C_1 extends B_1{	// C_1 클래스
		
	int c = 55;			// C_1 클래스의 멤버 변수
	
}


public class D_exe {
	public static void main(String[] args) {
		
		C_1 obj = new C_1();
		B_1 obj_1 = new B_1();
		
		System.out.println("obj 의 맴버변수  a  :  "+ obj.a);
		System.out.println("obj 의 맴버변수  b  :  "+ obj.b);
		System.out.println("obj 의 맴버변수  c  :  "+ obj.c);
		
	}
} 
