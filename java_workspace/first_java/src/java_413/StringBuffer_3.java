package java_413;

public class StringBuffer_3 {
	public static void main(String[] args) {
		
		long start, end;
		
		String str1 = new String("1~ 10000 의 합1 : ");
		StringBuffer str2 = new StringBuffer("1~ 10000의 합 2 : ");
		
		start = System.currentTimeMillis();
		
		for (int i = 0; i < 30000; i++) {
			
			str1 += i;
			str1 += "+";
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("String : " + (end-start));
		
		start = System.currentTimeMillis();
		
		for (int i = 0; i < 30000; i++) {
			
			str2.append(i);
			str2.append("+");
			
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("StringBuffer : " + (end-start));
	} 
}
