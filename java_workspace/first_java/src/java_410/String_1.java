package java_410;

public class String_1 {
	public static void main(String[] args) {
		
		char[] ss = {'k','o','r','e','a'};
		String str1 = "Hello";					// 문자열 대입
		
		String str2 = new String("java");		// 문자열 생성자
		String str3 = new String(ss);			// 문자 배열을 이용한 생성자
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str1 + str2 + str3);
		
	}
}
