package java_402;

class A_3{
	
	int a = 10;
	int b = 20;
	
	void display()
	{
		System.out.println("A_3 class a = " + a + ", A_3 class b = " +b);
	}
	
}

class B_3 extends A_3{
	
	int a = 100;
	int b = 200;
	
	
	void display() {
		
		System.out.println("B_3 class a = " + a + ", B_3 class b = " +b);
		
	}
	

	void show() {
		
		super.display();
		this.display();
		
		int total = this.a + this.b + super.a + super.b;
		
		System.out.println("total = " + total);
	}
}
	


public class SuperExe {
	public static void main(String[] args) {

		B_3 obj1 = new B_3();
		B_3 obj2 = null;
		
		A_3 obj3 = new B_3();
		
		System.out.println("a= " +obj3.a+ ", b = " +obj3.b);
		
		obj2 = (B_3)obj3;		// class casting 상속관계에서만 가능
		System.out.println("a = " +obj2.a+ ", b = " +obj2.b);
		obj2.show();
		obj2.display();
		
	}
}
