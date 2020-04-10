package java_409;

public class Nansu_1 {
	public static void main(String[] args) {
		
		int xxx = 34; // 하한값
		int yyy = 77; // 상한값
		
		int count = 0;
		
		
		// 난수 발생 공식 : (정수화)((상한값 - 하한값 + 1) * 난수 + 하한값)
		
		System.out.println(xxx + "~ " + yyy + " 사이 난수 발생  \n");
		
		
		for (int i = 0; i < 100; i++) {
			System.out.print((int)((yyy-xxx + 1)* Math.random()) + (xxx) + " ");
			
			count ++;
			
		
			if (count % 5 == 0) {
				System.out.println();
			}
		}
	}
}
