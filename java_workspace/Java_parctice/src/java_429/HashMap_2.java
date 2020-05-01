package java_429;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class HashMap_2 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("���ڹ�", new Integer(90));
		map.put("���ڹ�", new Integer(90));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(100));
		
		Set set = map.entrySet(); // HashMap�� ����� key/value�� entryset(Ű�� ���� ����)�� �����Ͽ� ��ȯ
		Iterator itt = set.iterator();
		
		while (itt.hasNext()) {
			Map.Entry e = (Entry)itt.next();
			System.out.println("�̸�: " + e.getKey()+ " ,���� : " + e.getValue());
		}
		System.out.println();
		
		set = map.keySet();
		System.out.println("������ ��� : " + set);
	
		Collection value = map.values();
		itt = value.iterator();
		
		int total = 0;
		
		while (itt.hasNext()) {
			Integer ii = (Integer)itt.next();
			System.out.println("����" +  ii);
			
			total += ii.intValue();
		}
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + (float)total/set.size());
		System.out.println("�ְ� ���� : " + Collections.max(value));
		System.out.println("���� ���� : " + Collections.min(value));
	}
}
