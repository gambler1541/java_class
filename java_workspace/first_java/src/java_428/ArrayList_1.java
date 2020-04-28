package java_428;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_1 {
	public static void main(String[] args) {
		
		ArrayList list_1 = new ArrayList(10);
		
		list_1.add(new Integer(5));
		list_1.add(new Integer(4));
		list_1.add(new Integer(3));
		list_1.add(new Integer(2));
		list_1.add(new Integer(1));
		list_1.add(new Integer(0));
		list_1.add(new Integer(1));
		list_1.add(new Integer(3));
		
		ArrayList list_2 = new ArrayList(list_1.subList(1, 4));
		
		print(list_1, list_2);
		
		Collections.sort(list_1);	// ��������(�⺻)
		Collections.sort(list_2);
		print(list_1, list_2);
		
		System.out.println("list_1.containsall(list2)" + list_1.containsAll(list_2));	// list_1�� list_2�� ������ 
																						// ������ �ִ����� Ȯ��
		
		list_2.add("B");
		list_2.add("C");
		list_2.add("A");
		
		System.out.println("list_1.contains(list_2)" + list_1.containsAll(list_2));
		
		print(list_1, list_2);
		
		list_2.set(3, "Queen"); // 3�� �ε��� �� ����
		list_2.set(0, "Park");
		print(list_1, list_2);
		
		//list_1���� list_2�� ��ġ�� �κи� ����� ������ ����
		System.out.println("list_1.retainAll(list_2)"  + list_1.retainAll(list_2));
		print(list_1, list_2);
		
		// list_2���� list_1�� ���Ե� ��ü���� ����
		
		for (int i = list_2.size() - 1; i >= 0; i--) {
			if (list_1.contains(list_2.get(i))) {
				list_2.remove(i);
			}
		}
		print(list_1, list_2);
	}

	private static void print(ArrayList list_1, ArrayList list_2) {
		System.out.println("list_1 : " + list_1);
		System.out.println("list_2 : " + list_2);
		System.out.println();
	}
}
