package java_413;

public class StringBuffer_1 {
	public static void main(String[] args) {
		
		StringBuffer str1 = new StringBuffer("Java");
		StringBuffer str2 = new StringBuffer(10);
		StringBuffer str3 = new StringBuffer();
		
		
		System.out.println("str1.length()	: " + str1.length());
		System.out.println("str1.capacity() : " + str1.capacity());
		
		System.out.println("str2.length()	: " + str2.length());
		System.out.println("str2.capacity() : " + str2.capacity());
		
		System.out.println("str3.length()	: " + str3.length());
		System.out.println("str3.capacity() : " + str3.capacity());
	}
}
