package java_410;

public class String_4 {
	public static void main(String[] args) {
		
		int i;
		
		String str = "2020 WorldCup Korea ";
		
		System.out.println("����  ���ڿ�   : " + str);
		System.out.print("���ڿ� ������ : ");
		
		for (int j = str.length()-1; j >= 0; j--) {
			
			System.out.print(str.charAt(j));
			
		}
		
		System.out.print("\n¦�� ���ڿ� : ");
		
		for (int j = 0; j < str.length(); j++) {
			if (j % 2 != 0) {
				System.out.print(str.charAt(j));
			}
			else {
				System.out.print(" ");
			}
		}
		
		System.out.print("\nȦ�� ���ڿ� : ");
		
		for (int j = 0; j < str.length(); j++) {
			if (j % 2 == 0) {
				System.out.print(str.charAt(j));
			}
			else {
				System.out.print(" ");
			}
		}
		
	}
}
