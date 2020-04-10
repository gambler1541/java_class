package java_410;

public class String_5 {
	public static void main(String[] args) {
		
		String str = "나는 초보다! 자바 별거 아니네!";
		

		boolean flag = str.startsWith("나는 고수다!");
		System.out.println(flag);						// false
		
		flag = str.startsWith("나는");
		System.out.println(flag);						// true
		
		flag = str.endsWith("별거 아니네");
		System.out.println(flag);						// false
		
		flag = str.endsWith("별거 아니네!");
		System.out.println(flag);						// true
		
	} 
	
}
