public class  Break_1
{
	public static void main(String[] args) 
	{
		int sum = 0;

		int  tt = 0;

		for (int i = 1;i < 100 ; i++ )
		{
			if (i % 3 == 0) // 3�� ��� ���ϱ�
			{
				sum += i;
				System.out.print(i + "\t");

				tt +=1;

				if (tt % 3 == 0)
				{
					System.out.println();
				}
			}
			if (sum > 200) // 3�� ����� ��
			{
				break;
			}

		}
		System.out.println("\n sum = " + sum);
	}
}
