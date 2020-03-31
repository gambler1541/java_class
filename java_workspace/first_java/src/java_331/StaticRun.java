package java_331;


class Static_1{
	
	static int num = 0;		// static으로 만들어진 멤버(변수)는 클래스명으로 접근 가능
	static int num_2 = 10;
	int a = 10;
	int b = 20;
	
}


public class StaticRun {
	public static void main(String[] args) {
		Static_1 ss1 = new Static_1();
		Static_1 ss2 = new Static_1();
		

		
		Static_1.num = 77;
		ss1.num_2 = 88;
		ss1.a = 33;
		ss1.b = 44;
		
		System.out.println("ss1 a: "+ss1.a+"  ss1 b: "+ss1.b+"  ss1.num: "+ss1.num_2);
		System.out.println("ss2 a: "+ss2.a+"  ss2 b: "+ss2.b+"  ss2.num: "+ss2.num_2);
		System.out.println("Static num: " + Static_1.num);
		System.out.println("Static num: " + Static_1.num_2);
	}
}
