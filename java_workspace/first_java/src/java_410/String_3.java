package java_410;

public class String_3 {
	public static void main(String[] args) {
		
		char[] char_str = new char[14];
		
		String str = "������ ���� ��ǥ�� ����";
		
		System.out.println("str ����    : " + str);
		System.out.println("str ���ڼ� : " + str.length());
		
		str.getChars(11, 14, char_str, 0);
		
		System.out.println("char str ���ڼ� : " + char_str.length);
		
		for (int i = 0; i < char_str.length; i++) {
			System.out.print(char_str[i]);
		}
	}
}
