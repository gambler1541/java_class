package java_409;

public class Wrapper_4 {
	public static void main(String[] args) {
		
		int abc = new Integer("789").intValue();
		int kbs = Integer.parseInt("699");
		Integer mbc = Integer.valueOf("433");
		
		int num_1 = Integer.parseInt("100", 2);
		int num_2 = Integer.parseInt("100", 8);
		int num_3 = Integer.parseInt("100", 16);
		int num_4 = Integer.parseInt("FF", 16);
		
		Integer integer_1 = Integer.valueOf("100", 2);
		Integer integer_2 = Integer.valueOf("100", 8);
		Integer integer_3 = Integer.valueOf("100",16);
		Integer integer_4 = Integer.valueOf("ff",16);
		
		System.out.println(abc);
		System.out.println(kbs);
		System.out.println(mbc);
		
		System.out.println("100(2) : " + num_1);
		System.out.println("100(8) : " + num_2);
		System.out.println("100(16) : " + num_3);
		System.out.println("ff(16) : " + num_4);
	
		System.out.println("100(2) : " + integer_1);
		System.out.println("100(8) : " + integer_2);
		System.out.println("100(16) : " + integer_3);
		System.out.println("ff(16) : " + integer_4);
		
	}
}
