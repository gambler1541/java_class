package java_410;

public class String_5 {
	public static void main(String[] args) {
		
		String str = "���� �ʺ���! �ڹ� ���� �ƴϳ�!";
		

		boolean flag = str.startsWith("���� �����!");
		System.out.println(flag);						// false
		
		flag = str.startsWith("����");
		System.out.println(flag);						// true
		
		flag = str.endsWith("���� �ƴϳ�");
		System.out.println(flag);						// false
		
		flag = str.endsWith("���� �ƴϳ�!");
		System.out.println(flag);						// true
		
	} 
	
}
