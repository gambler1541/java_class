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
			System.out.println("id�� password�� �Է��� �ּ���!!");
			System.out.println("id : ");
			String id = ss.next().trim();
			
			if (!map.containsKey(id)) {
				System.out.println("�Է��Ͻ�  " + id + " �� �������� �ʽ��ϴ�." );
				continue;
			}
			else {
				System.out.println("password : ");
				Integer password = ss.nextInt();
				System.out.println();
				// ����(key)�� �ش��ϴ� ��(value)�� ������
				if (!(map.get(id).equals(password))) {
					System.out.println(map.get(id));
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
				else {
					System.out.println("�α��� ����~~");
					break;
				}
			}
		}
	}
}
