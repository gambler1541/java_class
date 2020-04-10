package java_410;

public class String_12 {
	public static void main(String[] args) {
		
		String str = "높 이 나는 가 멀 새리 새 본다. 새일찍 일어나는 새가 모이를 새줍는다";
		System.out.println("검색할 문자열 \n : " + str);
		System.out.println("indexOf(새) : " + str.indexOf("새"));
		System.out.println("indexOf(새,10) : " + str.indexOf("새",10));
		System.out.println("lastIndexOf(새) : " + str.lastIndexOf("새"));
		System.out.println("lastIndexOf(새,10) : " + str.lastIndexOf("새",11));
	}
}
