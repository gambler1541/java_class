public class Return_1 
{
	public static void main(String[] args) 
	{
		int result1, result2, result3, result4;

		result1 = sum(10, 20);
		result2 = sub(10, 20);
		result3 = mul(10,20);
		result4 = div(40 , 4);

		System.out.println("10 + 20 = " + result1);
		System.out.println("10 - 20 = " + result2);
		System.out.println("10 * 20 = " + result3);
		System.out.println("40 / 4 = " + result4);

	}

	static int sum(int x, int y) // static : �̹� ������� method (�ε� �� ������� �־�� ��)
	{
		return (x + y);
	}

	static int sub(int x, int y)
	{
		return (x - y);
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
