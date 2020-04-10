package java_410;

public class String_7 {
	public static void main(String[] args) {
		
		String str = "	몇 개의 단어가 포함되어 있나요!";
		
		int count = 0;
		
		System.out.println(str.length());
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == 32) {			// 32 = ASCII code 공백
				
				count ++;
			}
			
		}
		
		
		System.out.println("단어의 갯수 : " + (count + 1) + " 개");
		
	
	}
}
