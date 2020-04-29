package java_429;

import java.util.HashMap;
import java.util.Map;

public class Generics_3 {
	public static void main(String[] args) {
		
		Map<String, Student> st = new HashMap<String, Student>();
		st.put("2009001", new Student(2009001, "����ǥ"));
		st.put("2009002", new Student(2009002, "���ܵ�"));
		st.put("2009003", new Student(2009003, "������"));
		st.put("2009004", new Student(2009004, "ȫ�浿"));

		// ��� �׸��� ����Ѵ�.
		System.out.println(st);
		
		// �ϳ��� �׸��� �����Ѵ�.
		st.remove("2009002");
		
		// �ϳ��� �׸��� ��ġ�Ѵ�.
		st.put("2009003", new Student(20090003, "��ä��"));
		// ���� �����Ѵ�.
		System.out.println(st.get("2009003"));
		// ��� �׸��� �湮�Ѵ�.
		for (Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("Key=" + key + ", value= " + value);
		}
	}
}

class Student{
	int no;
	String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
