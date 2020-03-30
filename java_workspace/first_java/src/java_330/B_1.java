package java_330;


class A_1 {
	 
	private int x = 10;
	private int y = 20;

	public int add()
	{
		return (x + y);
	}
	
	public int getx() {
		return x;
	}
	
	public int gety()
	{
		return y;
	}
	
	
	
	
}

public class B_1 {
	public static void main(String[] args) {
		
		A_1 obj = new A_1();
		
		System.out.println(" x "+obj.getx());
		System.out.println(" y "+obj.gety());
		System.out.println(" SUM = "+obj.add());
		
	}
}


