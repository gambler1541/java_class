package java_429;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Generics_4 {
	public static void main(String[] args) {
		
		Map<String, String> st = new HashMap<String, String>();
		
		st.put("map", "����");
		st.put("java","�ڹ�");
		st.put("school","�б�");
		st.put("korea","���ѹα�");
		st.put("king","�տտ�");
		st.put("seoul","���ѹα� ����");
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("���� �ܾ �Է��Ͻÿ�: ");
			String key = sc.next();
			if (key.equals("quit")) {
				break;
			}
			System.out.println("�ܾ��� �ǹ̴� "+ st.get(key));
		} while (true);
	}
}
