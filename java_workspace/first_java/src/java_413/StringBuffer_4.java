package java_413;

public class StringBuffer_4 {
	public static void main(String[] args) {
		
		StringBuffer sb_1 = new StringBuffer("korea");
		StringBuffer sb_2 = new StringBuffer("korea");
		
		
		if (sb_1 == sb_2) {
			System.out.println("sb_1 == sb2");
		}
		else {
			System.out.println("sb_1 != sb2");
		}
		
		if (sb_1.equals(sb_2)) {
			System.out.println("sb_1.equals(sb2) : True ");
		}
		else {
			System.out.println("sb_1.equals(sb2) : False ");
		}
		
		//StringBuffer의 내용을 String 으로 변환한다.
		
		String s_1 = sb_1.toString();
		String s_2 = sb_2.toString();
	
		if (s_1.equals(s_2)) {
			System.out.println("s_1.equals(s2) = True");
		}
		else {
			System.out.println("s_1.equals(s2) = False");
		}
	}
}
