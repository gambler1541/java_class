package java_409;

public class Wrapper_6 {
	public static void main(String[] args) {
		
		char[] obj = {'1', 'a', ' ','#','B'};
	
		for (int i = 0; i < obj.length; i++) {
			System.out.println("����[" + obj[i] + "] : ");
		
		if (Character.isDefined(obj[i])) {
			System.out.println("�����ڵ��Դϴ�.");
		}
		
		if (Character.isDigit(obj[i])) {
			System.out.println("���� �Դϴ�.");
		}
		
		if (Character.isLetter(obj[i])) {
			System.out.println("���� �Դϴ�.");
		}
		
		if (Character.isLowerCase(obj[i])) {
			System.out.println("�ҹ��� �Դϴ�.");
		}

		if (Character.isUpperCase(obj[i])) {
			System.out.println("�빮�� �Դϴ�.");
		}
		
		if (Character.isSpace(obj[i])) {
			System.out.println("���� ���� �Դϴ�.");
		}
		
		if (Character.isAlphabetic(obj[i])) {
			System.out.println("���ĺ� ���� �Դϴ�.");
		}
		
		}
	}
}
