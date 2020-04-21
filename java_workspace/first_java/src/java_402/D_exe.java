package java_402;

class A_1{			// A_1 클래스
	static String name = "가나다";
	int a = 11;		// A_1 클래스의 맴버 변수
	
}

class B_1 extends A_1{	// B_1 클래스
	
	int b = 33;			// B_1 클래스의 멤버 변수
	
}




public class D_exe {
	public static void main(String[] args) {
		System.out.println(new A_1().a);
	}
} 
