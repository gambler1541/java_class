package java_413;

public class StringBuffer_2 {
	public static void main(String[] args) {
		
		
		StringBuffer str = new StringBuffer("Java");
		str.append(" Program ");
		System.out.println(str);
		
		for (int i = 0; i < str.length(); i++) {
			
			System.out.print(str.charAt(i) + "\t");
			
		}
		
		str.insert(4, "��");
		
		System.out.println("\n" + str);
		System.out.println("���ڿ��� ����	: " + str.length());
		str.setLength(5);
		
		System.out.println("���ο� ���ڿ��� ����	: " + str.length());
		System.out.println("setLength() ���� ���ڿ�: " + str );
		System.out.println("str.reverse()	: " + str.reverse());
		
		
		
		
	}
}
