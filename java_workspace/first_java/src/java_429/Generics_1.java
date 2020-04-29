package java_429;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics_1 {
	public static void main(String[] args) {
		
		ArrayList<Student_3> list = new ArrayList<>();
		
		list.add(new Student_3("수선화",1,1));
		list.add(new Student_3("백합",1,2));
		list.add(new Student_3("장미",1,3));
		list.add(new Student_3("코스모스",2,1));
		list.add(new Student_3("해바라기",2,2));
		
		Iterator<Student_3> itt = list.iterator();
		while (itt.hasNext()) {
			Student_3 ss = itt.next();
			System.out.println(ss.name + " " + ss.ban + " " + ss.noo);
		}
		
		System.out.println();
		System.out.println();
		
		for (Student_3 ss : list) {
			System.out.println(ss.name);
		}
		
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
//			Student_3 stt = list.get(i);
//			System.out.println(stt.name);
			System.out.println(list.get(i).name);
		}
	}
	
}
class Student_3 {
	String name;
	int ban;
	int noo;
	
	public Student_3(String name, int ban, int noo) {
		this.name = name;
		this.ban = ban;
		this.noo = noo;
	}
	
}