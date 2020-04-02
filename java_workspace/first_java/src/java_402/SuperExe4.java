package java_402;


class A_6{

	int a = 0;

	public A_6() {
		System.out.println(" A_6 default 생성자 호출 ~~ ");
	}
	
	public A_6(int a) {

		this.a = a;

	}

}


class B_6 extends A_6{

	int b = 0;

	public B_6() {
		System.out.println(" B_6 default 생성자 호출 ~~ ");
	}

	public B_6(int a, int b) {

		super(a);
		this.b = b;
	}
}
class C_6 extends B_6{

	int c = 0;

	public C_6(int a, int b, int c) {

		super(a,b);
		this.c = c;
	}
	
	public C_6() {

		System.out.println(" C_6 default 생성자 호출 ~~ ");
	}
	
	public String toString() {
		
		return "ㅋㅋㅋㅋ";
	}
}


public class SuperExe4 {
	public static void main(String[] args) {
			
		
//		C_6 obj1 = new C_6(44,55,77);
		C_6 obj2 = new C_6();
		
//		System.out.println("a = " + obj1.a + ", b = " + obj1.b + ", c = "+ obj1.c);
		System.out.println(obj2);
		
	}
}
