public class ShiftTest_1 
{
	public static void main(String[] args) 
	{
		// 20 숫자의 3번째 비트는 무엇인가요
		// 20 = 0001 0100(10100)

		int num = 20;
		num = num >> 2;
		num = num & 1;

		System.out.println("20의 3번째 비트는: " + num);
	}
}