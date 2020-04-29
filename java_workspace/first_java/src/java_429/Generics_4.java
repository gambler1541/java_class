package java_429;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Generics_4 {
	public static void main(String[] args) {
		
		Map<String, String> st = new HashMap<String, String>();
		
		st.put("map", "지도");
		st.put("java","자바");
		st.put("school","학교");
		st.put("korea","대한민국");
		st.put("king","왕왕왕");
		st.put("seoul","대한민국 수도");
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("영어 단어를 입력하시오: ");
			String key = sc.next();
			if (key.equals("quit")) {
				break;
			}
			System.out.println("단어의 의미는 "+ st.get(key));
		} while (true);
	}
}
