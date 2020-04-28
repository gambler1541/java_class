package java_428;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		Set<Integer> set2 = new TreeSet<>();
		
		for (int i = 0; set.size() < 6; i++) {
			i = i + 1;
			int num = (int)(Math.random() * 45 + 1);
			set.add(new Integer(num));
		}
		
		System.out.println(set);
		
		for (int i = 0; set2.size() < 7; i++) {
			i = i + 1;
			int num = (int)(Math.random() * 45 + 1);
			set2.add(new Integer(num));
		}
		System.out.println(set2);
	}
}
