package java_427;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Vector_2 {
	public static void main(String[] args) {
		
		int i;
		
		Date date = new Date();
		Vector vv = new Vector(3,5);
		
		vv.add("Java");
		vv.add(new Double(56.7));
		vv.add(date);
		
		System.out.println("==================3개의 객체 추가 =======================");
		
		System.out.println("size 11: " + vv.size() + ", capacity : " +  vv.capacity());
		
		System.out.println("=====================================================");
		
		for (int j = 0; j < 10; j++) {
			vv.add(new Integer(j  + 1));
		}
		vv.add("Korea");
		
		System.out.println("==================10개의 객체 추가 ========================");
		System.out.println("size22: " + vv.size() + ", capacity : " + vv.capacity());
		
		System.out.println("----------------- Vector 출력 --------------------------");
		
		Enumeration enu = vv.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement()  + " ");
		}
		
		System.out.println("=============== 객체 포함 확인 =================");
		
		if (vv.contains("javar")) {
			System.out.println("Java 문자열 포함됨");
		}
		else {
			System.out.println("Java 문자열 포함 안안안됨");
		}
		
		System.out.println("56.7 객체 위치 : " + vv.indexOf(new Double(56.7)));
		System.out.println("\n 입력시간 : " + vv.get(vv.indexOf(date)));
		
		// Vector는 capacity가 부족할 경우 자동적으로 기존의 크기보다 2배의 크기로 증가된다.
		// 그래서 v의 capacity는 12가 된다.
		
		
		// data 객체 삭제
		
		vv.removeElementAt(vv.lastIndexOf(date));
		
		for (int j = 0; j < vv.size(); j+=3) {
			vv.removeElementAt(j);
		}
		
		vv.setElementAt("seoul", 2);
		// 3번째 위치에 korea 문자열 추가
		
		enu = vv.elements();
		
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement() + " ");
		}
		System.out.println("\n size : " + vv.size() + ", capacity : " + vv.capacity());
		
		vv.trimToSize(); // 공백 제거
		System.out.println("\n size : " + vv.size() + ", capacity : " + vv.capacity());
		
		vv.setSize(3);	// 크기를 3으로 조정
		
		enu = vv.elements();
		
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement() +  " ");
		}

		vv.removeAllElements(); // 모든 객체 제거
		System.out.println("\n size : " + vv.size() + ", capacity : " + vv.capacity());
	}
}
