public class Return_1 
{
	public static void main(String[] args) 
	{
		int result3, result4;

		result3 = mul(10,20); // return값이 있는 메서드(result3,4에 저장)
		result4 = div(40 , 4);
		
		sum(10,20);  // return되지 않는 메서드
		sub(10,20);
	
		System.out.println("10 * 20 = " + result3);
		System.out.println("40 / 4 = " + result4);

	}

	static void sum(int x, int y) // static : 이미 만들어진 method (로드 시 만들어져 있어야 함)
	{
		System.out.println("10 + 20 = " + (x + y));
		return;							// void에서는 return문을 생략할수 있다.
	}

	static void sub(int x, int y) // return 받지않는 메서드는 자료형이 아닌 void
	{
		System.out.println("10 - 20 = " + (x - y));
		return;
	}

	static int mul(int x, int y)
	{
		return (x * y);
	}

	
	static int div(int x, int y)
	{
		return (x / y);
	}
}
