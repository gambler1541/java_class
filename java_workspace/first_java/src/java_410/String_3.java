package java_410;

public class String_3 {
	public static void main(String[] args) {
		
		char[] char_str = new char[14];
		
		String str = "오늘은 사전 투표일 라라라";
		
		System.out.println("str 문자    : " + str);
		System.out.println("str 문자수 : " + str.length());
		
		str.getChars(11, 14, char_str, 0);
		
		System.out.println("char str 문자수 : " + char_str.length);
		
		for (int i = 0; i < char_str.length; i++) {
			System.out.print(char_str[i]);
		}
	}
}
