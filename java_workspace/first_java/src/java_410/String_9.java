package java_410;

public class String_9 {
	public static void main(String[] args) {
		
		String str1 = "JAVA";
		String str2 = "java";
		
		System.out.println("문자열 str1 = " + str1 );
		System.out.println("문자열 str2 = " + str2 );
		
		System.out.println("JAVA와 java 는 " +(str1.equals(str2) ? "동일" : "틀림"));					// 대소문자구분
		System.out.println("JAVA와 java 는 " +(str1 == str2? "동일" : "틀림"));						// == 주소비교
		System.out.println("JAVA와 java 는 " +(str1.equalsIgnoreCase(str2) ? "동동일" : "틀틀림"));		// 대소문자구분X
		
	}
}
