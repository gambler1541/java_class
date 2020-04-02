package java_402;

class A_8
{
	int a = 10;
	
	public A_8() {
		super();
	}
}

class B_8 extends A_8
{
	int b = 20;
	
	public B_8() {
		super();
	}
}

class C_8 extends B_8
{
	int c = 30;
	
	public C_8() {
		super();
	}
}


public class Convert_2 {
	public static void main(String[] args) {
		
		C_8 obj = new C_8();
		
		C_8 obj2 = null;
		
		A_8 obj3 = new C_8(); // 모든 객체는 object로 형변환이 가능하다
		
		obj2 = (C_8)obj3;
		
		
		System.out.println("a = " + obj.a);
		System.out.println("b = " + obj.b);
		System.out.println("c = " + obj.c);
	}
}
