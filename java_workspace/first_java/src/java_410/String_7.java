package java_410;

public class String_7 {
	public static void main(String[] args) {
		
		String str = "	�� ���� �ܾ ���ԵǾ� �ֳ���!";
		
		int count = 0;
		
		System.out.println(str.length());
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == 32) {			// 32 = ASCII code ����
				
				count ++;
			}
			
		}
		
		
		System.out.println("�ܾ��� ���� : " + (count + 1) + " ��");
		
	
	}
}
