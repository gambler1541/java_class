 package java_428;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_3 {
	public static void main(String[] args) {
		
		ArrayList<String> numbers = new ArrayList<String>(); // ���׸�(����Ʈ�� ������ Ÿ���� ����)
		
		numbers.add("10");
		numbers.add("20");
		numbers.add("30");
		numbers.add("40");
		System.out.println("add(��)");
		System.out.println(numbers);
		
		
		String a = "asdfasdf";
		
		System.out.println(a.length());
		
		String[] a1 = new String[10];
		
		System.out.println(a1.length);
		
		numbers.add(1, "50");
		System.out.println("\nadd(�ε��� ��)");
		System.out.println(numbers);
		
		numbers.remove(2);
		System.out.println("\nremove(�ε���)");
		System.out.println(numbers);
		
		System.out.println("\nget(�ε��� )");
		System.out.println(numbers.get(2));
		
		System.out.println("\nsize()");
		System.out.println(numbers.size());
		
		System.out.println("\nindexof()");	//ã�� ���� ���ٸ� -1�� ����(�ִٸ� �ε��� ����)
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
		
		// ���� For��(�迭�� colletion�� ���)
		for (String value : numbers){
			System.out.println(value);
		}
		
		System.out.println("\nfor");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		} 
	}
}
