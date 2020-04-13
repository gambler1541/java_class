package java_413;

public class StringBuffer_2 {
	public static void main(String[] args) {
		
		
		StringBuffer str = new StringBuffer("Java");
		str.append(" Program ");
		System.out.println(str);
		
		for (int i = 0; i < str.length(); i++) {
			
			System.out.print(str.charAt(i) + "\t");
			
		}
		
		str.insert(4, "★");
		
		System.out.println("\n" + str);
		System.out.println("문자열의 길이	: " + str.length());
		str.setLength(5);
		
		System.out.println("새로운 문자열의 길이	: " + str.length());
		System.out.println("setLength() 적용 문자열: " + str );
		System.out.println("str.reverse()	: " + str.reverse());
		
		
		
		
	}
}
