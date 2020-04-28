package java_428;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_4 {
	public static void main(String[] args) {
	
		
		ArrayList original = new ArrayList(10); 
		ArrayList copy11 = new ArrayList(10); 
		ArrayList copy22 = new ArrayList(10); 
		ArrayList copy33 = new ArrayList(10); 
	
		for (int i = 0; i < 10; i++) {
			original.add(i + "");
		}
		
		Iterator itt = original.iterator();
		
		while(itt.hasNext()) {
			copy11.add(itt.next());
		}
		
		System.out.println("Original => copy11 로 복사");
		System.out.println("original : " + original);
		System.out.println("copy11   : " + copy11);
		System.out.println();
		
		/*
		 * itt = original.iterator();
		 * 
		 * while(itt.hasNext()) { copy22.add(itt.next()); 
		 * 									itt.remove())}
		 * 
		 * System.out.println("Original => copy22 로 이동");
		 * System.out.println("Original : " + origianl); 
		 * System.out.println("copy22   : " + copy22)
		 * System.out.println()
		 */
		itt = original.iterator();
		int count = 0;
		while (itt.hasNext()) {
			if (count % 2 !=0) {
				copy33.add(itt.next());
			}else 
				itt.next();
			count++;
			// itt.remove();
		}
		System.out.println("Original => copy33으로 짝수 복사");
		System.out.println("original : " + original);
		System.out.println("copy33   : " + copy33);
		System.out.println();
		
	}
}
