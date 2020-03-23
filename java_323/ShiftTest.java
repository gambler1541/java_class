public class ShiftTest 
{
	public static void main(String[] args) 
	{
		int x = 1, y = -1;

		System.out.println("쉬프트 연산 x = 1, y = -1" );
		System.out.println("x << 1 = " + ( x << 1));
		System.out.println("y << 1 = " + (y << 1));
		System.out.println("x >> 1 = " + (x >> 1));
		System.out.println("y >> 1 = " + (y >> 1));
		System.out.println("x >>> 1 = " +(x >>> 1));
		System.out.println("y >>> 1 = " +(y >>> 1));
	}
}
