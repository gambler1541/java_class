public class Return_1 
{
	public static void main(String[] args) 
	{
		int result3, result4;


		sum(10,20);  // return���� �ʴ� �޼���
		sub(10,20);
		mul(10,20);
		div(40,4);

		result3 = mul(10,20)

	}

	static void sum(int x, int y) // static : �̹� ������� method (�ε� �� ������� �־�� ��)
	{
		System.out.println("10 + 20 = " + (x + y));
		return;							// void������ return���� �����Ҽ� �ִ�.
	}

	static void sub(int x, int y) // return �����ʴ� �޼���� �ڷ����� �ƴ� void
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
