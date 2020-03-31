package java_331;


class Static_1{
	
	static int num = 0;
	int a = 10;
	int b = 20;
	
}



public class StaticRun {
	public static void main(String[] args) {
	
		Static_1 ss1 = new Static_1();
		Static_1 ss2 = new Static_1();
		
		ss1.num = 77;
		ss1.a = 33;
		ss1.b = 44;
		
		System.out.println("ss1 a: "+ss1.a+"  ss1 b: "+ss1.b+"  ss1.num: "+ss1.num);
		System.out.println("ss2 a: "+ss2.a+"  ss2 b: "+ss2.b+"  ss2.num: "+ss2.num);
		System.out.println("Static num: " + Static_1.num);
	}
}
