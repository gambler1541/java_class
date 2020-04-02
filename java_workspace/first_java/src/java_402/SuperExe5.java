package java_402;


class Parent{
	
	int x = 777;
	
	void message() {
		
		System.out.println("x = " + x);
	}
	
}

class Child extends Parent{
	
	int x = 9999;
	
	void message() {
		
		System.out.println(" x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

public class SuperExe5 {
	public static void main(String[] args) {
		
		Parent obj = new Child();
		
		obj.message();
		System.out.println("x = " + obj.x);
		
		
	}
}
