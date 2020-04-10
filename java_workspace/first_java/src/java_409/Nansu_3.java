package java_409;

import java.util.Random;

public class Nansu_3 {
	public static void main(String[] args) {
		
		Random rnd = new Random(System.currentTimeMillis());
		
		
		int count = 1;
		
		for (int i = 0; i <200; i++) {
			System.out.printf("%.2f\t",(float)( rnd.nextDouble()*(300.1+0.1+1)+ 0.1));
		
			if (count % 5 == 0) {
				System.out.println();
			}
			++count;
		}
	}
}


