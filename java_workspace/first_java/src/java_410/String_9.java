package java_410;

public class String_9 {
	public static void main(String[] args) {
		
		String str1 = "JAVA";
		String str2 = "java";
		
		System.out.println("���ڿ� str1 = " + str1 );
		System.out.println("���ڿ� str2 = " + str2 );
		
		System.out.println("JAVA�� java �� " +(str1.equals(str2) ? "����" : "Ʋ��"));					// ��ҹ��ڱ���
		System.out.println("JAVA�� java �� " +(str1 == str2? "����" : "Ʋ��"));						// == �ּҺ�
		System.out.println("JAVA�� java �� " +(str1.equalsIgnoreCase(str2) ? "������" : "ƲƲ��"));		// ��ҹ��ڱ���X
		
	}
}
