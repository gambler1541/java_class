package java_427;

import java.util.Vector;

public class Vector_1 {
	public static void main(String[] args) {
		
		Vector vv = new Vector(5);
		
		vv.add("1");
		vv.add("2");
		vv.add("3");
		vv.add("4");
		vv.add("5");
		vv.add("6");
		
		print(vv);
		
		vv.trimToSize(); // 빈 공간을 없앤다 용량과 크기가 같아 진다.
		
		System.out.println("========================66");
		
		print(vv);
		
		vv.ensureCapacity(7); // Vector 의 용량이 최소한 minCapacity가 되도록 한다
		System.out.println("========================77");
		print(vv);
		System.out.println("========================88");
		vv.add("1");
		vv.add("2");
		vv.add("3");
		vv.add("4");
		vv.add("5");
		vv.add("6");
		vv.add("7");
		vv.add("8");
		print(vv);
		
		vv.setSize(8);
		System.out.println("======================== ====99");
		print(vv);
	}
	static void print(Vector vv) {
		
		System.out.println(vv);
		System.out.println("vv.size: " + vv.size());
		System.out.println("vv.capacity: " + vv.capacity());
		
		
	}
}