public class  Test_1
{
	public static void main(String[] args) 
	{
		/*
		1 ���� 100 ���̿�
		3�� 7�� ������� ���� ���ϼ���

		*/

		int sum = 0;
		int a;



		for (int i =1; i <= 100 ; i ++ )
		{
			if (i % 21 == 0)
			{
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println("1~100 ������ ���ڿ��� 3�� 7�� ������� ��: " + sum);
	}
}
