package java_429;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Generics_2 {
	public static void main(String[] args) {
		ArrayList<Student_4> list = new ArrayList<Student_4>();
		
		list.add(new Student_4("���� ȫ", 1, 1, 100, 90, 80));
		list.add(new Student_4("�ش� ȭ ", 1, 2, 67, 45, 83));
		list.add(new Student_4("���� ��", 1, 3, 79, 36, 56));
		list.add(new Student_4("�޸��̲�", 1, 4, 66, 77, 88));
		list.add(new Student_4("�鱹 ȭ", 2, 1, 73, 52, 64));
		list.add(new Student_4("�и��̲� ", 2, 2, 90, 27, 64));
		list.add(new Student_4("�ڽ���", 3, 1, 78, 84, 34));
		list.add(new Student_4("���߽Ž�", 3, 2, 77, 59, 63));
	
		Collections.sort(list);
		
		Iterator<Student_4> itt = list.iterator();
		
		while (itt.hasNext()) {
			Student_4 stt = itt.next();
			System.out.println(stt);
		}
	}
}

class Student_4 implements Comparable<Student_4>{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int total;
	
	public Student_4(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	
		total = kor + eng + math;
	}

	@Override
	public int compareTo(Student_4 stt) {
		return this.total - stt.total;
	}
	
	public String toString() {
		return name + "\t" + ban + "\t" + no + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total;
	}
}
