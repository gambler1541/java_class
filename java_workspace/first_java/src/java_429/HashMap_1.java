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
			System.out.println("id�� password�� �Է��� �ּ��� !!");
			System.out.println("id : ");
			Integer id = ss.nextInt();

			if (!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� " + id + " �� �������� �ʽ��ϴ�.");
				continue;
			}
			else {
				System.out.println("password : ");
				Integer password = ss.nextInt();
				System.out.println();
				if (!(map.get(id).equals(password))) {
					System.out.println(map.get(id));
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
				}
				else {
					System.out.println("�����մϴ�. �α��� �Ͽ����ϴ�.");
					break;
				}

			}
		}
		ss.close();
	}
}
