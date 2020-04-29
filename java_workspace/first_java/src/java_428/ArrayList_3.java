 package java_428;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_3 {
	public static void main(String[] args) {
		
		ArrayList<String> numbers = new ArrayList<String>(); // 제네릭(리스트에 데이터 타입을 정함)
		
		numbers.add("10");
		numbers.add("20");
		numbers.add("30");
		numbers.add("40");
		System.out.println("add(값)");
		System.out.println(numbers);
		
		
		String a = "asdfasdf";
		
		System.out.println(a.length());
		
		String[] a1 = new String[10];
		
		System.out.println(a1.length);
		
		numbers.add(1, "50");
		System.out.println("\nadd(인덱스 값)");
		System.out.println(numbers);
		
		numbers.remove(2);
		System.out.println("\nremove(인덱스)");
		System.out.println(numbers);
		
		System.out.println("\nget(인덱스 )");
		System.out.println(numbers.get(2));
		
		System.out.println("\nsize()");
		System.out.println(numbers.size());
		
		System.out.println("\nindexof()");	//찾는 값이 없다면 -1을 리턴(있다면 인덱스 리턴)
		System.out.println(numbers.indexOf("45"));
		
		Iterator<String> it = numbers.iterator();	
		
		System.out.println("\niterator");
		
		while (it.hasNext()) {
			String value = (String) it.next();
			if (value.equals("30")) {
				it.remove();
			}
			System.out.println(value);
		}
		System.out.println(numbers);
		
		System.out.println("\nfor each");
		
		// 향상된 For문(배열과 colletion에 사용)
		for (String value : numbers){
			System.out.println(value);
		}
		
		System.out.println("\nfor");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		} 
	}
}
