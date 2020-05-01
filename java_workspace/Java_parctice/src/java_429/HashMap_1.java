package java_429;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_1 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("aaa", 1234);
		map.put("bbb", 4321);
		map.put("ccc", 5678);
		map.put("ddd", 8765);
		
		Scanner ss = new Scanner(System.in);
		
		while (true) {
			System.out.println("id와 password를 입력해 주세요!!");
			System.out.println("id : ");
			String id = ss.next().trim();
			
			if (!map.containsKey(id)) {
				System.out.println("입력하신  " + id + " 는 존재하지 않습니다." );
				continue;
			}
			else {
				System.out.println("password : ");
				Integer password = ss.nextInt();
				System.out.println();
				// 인자(key)에 해당하는 값(value)을 가져옴
				if (!(map.get(id).equals(password))) {
					System.out.println(map.get(id));
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				else {
					System.out.println("로그인 성공~~");
					break;
				}
			}
		}
	}
}
