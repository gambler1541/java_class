package java_413;

import java.util.StringTokenizer;

public class StringTokenizerTet {
	public static void main(String[] args) {
		
		String str = "�ڹٴ� �پ��� ���ڿ� ó��,��¥ ó��," + 
					 "�ð� ó����, ���� �޼ҵ带 ���� �ֽ��ϴ�.";
		
		StringTokenizer stt = new StringTokenizer(str, "��");
		
		System.out.println("��ū '��' �� ���� : " + stt.countTokens() + " �� \n");
		
		while (stt.hasMoreTokens()) {
			System.out.println(stt.nextElement());
		}
		
		
	}
}
