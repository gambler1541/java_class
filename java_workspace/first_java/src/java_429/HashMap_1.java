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
			System.out.println("id�� password�� �Է��� �ּ��� !!");
			System.out.println("id : ");
			int id = ss.nextInt();
			
			if (!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� " + id + " �� �������� �ʽ��ϴ�.");
				continue;
			}
			else {
				System.out.println("password : ");
				String password = ss.next().trim();
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
		
	}
}
