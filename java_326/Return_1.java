public class Return_1 
{
	public static void main(String[] args) 
	{
		int result3, result4;


		sum(10,20);  // return되지 않는 메서드
		sub(10,20);
		mul(10,20);
		div(40,4);

		result3 = mul(10,20)

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

	static void mul(int x, int y)
	{
	
		System.out.println("10 * 20 = " + (x *y));
		return ;
	}

	
	static void div(int x, int y)
	{
		System.out.println("40 / 4 = " + (x / y));
		return;
	}
}
