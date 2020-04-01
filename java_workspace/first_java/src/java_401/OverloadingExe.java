package java_401;

class Overloading{
	
	void display()	// 매개변수 없음
	{
		System.out.println("전달된 값 없음");
	}
	
	void display(int a)	// 매개변수 정수형 1개
	{
		System.out.println("전달된 값(int):" + a);
	}
	
	void display(String name)	// 매개변수 문자형 1개
	{
		System.out.println("전달된 값(string): " + name);
	}
	
	void display(String name, int age)	// 문자, 정수 매개변수 2개
	{
		System.out.println("전달된 값(String, int): " + name +", "+ age);
	}
	
	void display(String name, int age, String a)	// 문자, 정수 매개변수 3개
	{
		System.out.println("전달된 값(String, int, String): " + name +", "+ age + ", " + a);
	}
	
}


public class OverloadingExe {
	public static void main(String[] args) {
		
		Overloading over = new Overloading();
		
		over.display();
		over.display(27);
		over.display("개나리");
		over.display("벚꽃", 23);
		over.display("벚꽃", 23, "대한민국");
				
	}
}
