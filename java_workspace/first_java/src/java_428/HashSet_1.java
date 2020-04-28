package java_428;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet_1 {
	public static void main(String[] args) {
		
		Object[] obj = {"1", new Integer(1), "4", "4",
						"2", "2", "3", "3", "4", "4"};
		
		Set sett = new LinkedHashSet();
		
		for (int i = 0; i < obj.length; i++) {
			sett.add(obj[i]);
		}
		System.out.println(sett);
	} 
}
