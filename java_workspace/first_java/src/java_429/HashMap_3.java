package java_429;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_3 {

	static HashMap phoneBook = new HashMap();

	public static void main(String[] args) {

		addPhoneNO("ģ��","����ȭ","010-456-7890");
		addPhoneNO("ģ��","�ش�ȭ","010-889-5654");
		addPhoneNO("ģ��","�ش�ȭ","010-376-8845");
		addPhoneNO("ģ��","�鱹ȭ","010-924-1255");
		addPhoneNO("ȸ��","���갭","010-563-2538");
		addPhoneNO("ȸ��","������","010-764-5841");
		addPhoneNO("ȸ��","�ݰ�","010-543-8977");
		addPhoneNO("ȸ��","�Ѱ�","010-283-6653");
		addPhoneNO("��Ź","010-833-4444");
		addPhoneNO("�����","010-1232-4444");

		printList();
	}
	// ��ȭ ��ȣ�� ��ü�� ���
	private static void printList() {
		Set set = phoneBook.entrySet();
		Iterator itt = set.iterator();

		while (itt.hasNext()) {

			Map.Entry e = (Entry) itt.next();

			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();

			System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");

			while (subIt.hasNext()) {
				Map.Entry subE = (Entry) subIt.next();

				String telNo = (String) subE.getKey();
				String name = (String) subE.getValue();

				System.out.println(name + "  " + telNo);

			}
			System.out.println();
		}
	}
	private static void addPhoneNO(String name, String tel) {
		addPhoneNO("��Ÿ", name, tel);
	}
	
	private static void addPhoneNO(String groupName, String name, String tel) {
		addGroup(groupName);
		
		HashMap group = (HashMap) phoneBook.get(groupName);
		group.put(tel, name);
	}
	
	private static void addGroup(String groupName) {
		if (!phoneBook.containsKey(groupName)) { // Ű ���� Ȯ����
			phoneBook.put(groupName, new HashMap());
		}
	}
}
