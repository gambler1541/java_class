package java_410;

public class String_11 {
	public static void main(String[] args) {
		
		String str_1 = "AAA";
		String str_2 = new String("AAA");
		
		if (str_1 == str_2) {
			System.out.println("str_1 == str_2 : true");
		}
		else {
			System.out.println("str_1 == str_2 : false");
		}
		
		System.out.println();
		System.out.println("str_1 : " + System.identityHashCode(str_1));
		System.out.println("str_2 : " + System.identityHashCode(str_2));
		
		str_2 = str_2.intern();
		
		// intern() 메소드는 새롭게 만들어진 String객체를 상수화 시켜 줍니다.
		// 만들어진 String 객체가 이미 상수로 만들어진 문자열이라면 지금 만들어진 놈을 버리고, 상수를 가리키게 합니다.
		// 즉, Heap에 새롭게 만들어진 객체를 버리고, 상수를 재활용하도록 하게 하는것이죠.
	
		if (str_1 == str_2) {
			System.out.println("str_1 == str_2 : true");
		}
		else {
			System.out.println("str_1 == str_2 : false");
		}
		
		System.out.println();
		System.err.println("str_1 : " + System.identityHashCode(str_1));
		System.err.println("str_2 : " + System.identityHashCode(str_2));
		
	}
}
