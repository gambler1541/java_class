package java_331;



public class Circle_1 {
	public static void main(String[] args) {
		
		final float PI = 3.1415f;	// 상수는 대문자 쓰기를 권함
		int r = 10;
		
		r = 20;
		
		double area = PI * r * r;
		double length = 2 * PI * r;
		 
		System.out.printf("원의 넓이:%.2f\u33A0\n",area);
		System.out.printf("원의 둘레:%.2f\u339D", length);
	}
}
