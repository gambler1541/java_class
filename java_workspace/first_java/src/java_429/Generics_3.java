package java_429;

import java.util.HashMap;
import java.util.Map;

public class Generics_3 {
	public static void main(String[] args) {
		
		Map<String, Student> st = new HashMap<String, Student>();
		st.put("2009001", new Student(2009001, "구준표"));
		st.put("2009002", new Student(2009002, "금잔디"));
		st.put("2009003", new Student(2009003, "윤지후"));
		st.put("2009004", new Student(2009004, "홍길동"));

		// 모든 항목을 출력한다.
		System.out.println(st);
		
		// 하나의 항목을 삭제한다.
		st.remove("2009002");
		
		// 하나의 항목을 대치한다.
		st.put("2009003", new Student(20090003, "김채이"));
		// 값을 참조한다.
		System.out.println(st.get("2009003"));
		// 모든 항목을 방문한다.
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
