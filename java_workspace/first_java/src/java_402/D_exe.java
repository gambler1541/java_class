package java_402;

class A_1{			// A_1 Ŭ����
	
	int a = 11;		// A_1 Ŭ������ �ɹ� ����
	
}

class B_1 extends A_1{	// B_1 Ŭ����
	
	int b = 33;			// B_1 Ŭ������ ��� ����

}

class C_1 extends B_1{	// C_1 Ŭ����
		
	int c = 55;			// C_1 Ŭ������ ��� ����
	
}


public class D_exe {
	public static void main(String[] args) {
		
		C_1 obj = new C_1();
		B_1 obj_1 = new B_1();
		
		System.out.println("obj �� �ɹ�����  a  :  "+ obj.a);
		System.out.println("obj �� �ɹ�����  b  :  "+ obj.b);
		System.out.println("obj �� �ɹ�����  c  :  "+ obj.c);
		
	}
} 
