package java_429;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_1 {
	public static void main(String[] args) {
		HashMap<Integer,Integer> map = new HashMap<>();

		map.put(1234,1234);
		map.put(1111, 1111);
		map.put(4567, 4567);
		map.put(7890 ,7890);

		Scanner ss = new Scanner(System.in);

		while (true) {
			System.out.println("id와 password를 입력해 주세요 !!");
			System.out.println("id : ");
			Integer id = ss.nextInt();

			if (!map.containsKey(id)) {
				System.out.println("입력하신 " + id + " 는 존재하지 않습니다.");
				continue;
			}
			else {
				System.out.println("password : ");
				Integer password = ss.nextInt();
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
		ss.close();
	}
}
