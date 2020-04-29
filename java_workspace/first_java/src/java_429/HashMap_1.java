package java_429;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_1 {
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put(1234, "korea");
		map.put(1111, "asdf");
		map.put(4567, "asdf");
		map.put(7890, "seoul");
		
		Scanner ss = new Scanner(System.in);
		
		while (true) {
			System.out.println("id와 password를 입력해 주세요 !!");
			System.out.println("id : ");
			int id = ss.nextInt();
			
			if (!map.containsKey(id)) {
				System.out.println("입력하신 " + id + " 는 존재하지 않습니다.");
				continue;
			}
			else {
				System.out.println("password : ");
				String password = ss.next().trim();
				System.out.println();
				if (!(map.get(id).equals(password))) {
					System.out.println(map.get(id));
					System.out.println("비밀번호가 일치하지 않습니다");
				}
				else {
					System.out.println("축하합니다. 로그인 하였습니다.");
					break;
				}
				
			}
		}
		
	}
}
