public class While_1 
{
	public static void main(String[] args) 
	{
		int cnt = 0, sum = 0, odd = 0, even = 0;
		

		// while���� ����� ���� �Һи���
		while (cnt <= 10)
		{
			sum += cnt;

			if (cnt % 2 == 0)
			{
				even += cnt;
			}
			else{
				odd += cnt;
			}
			cnt ++;
		}
		System.out.println("1 ~ 10 ������ ����?> " + sum);
		System.out.println("1 ~ 10 ������ Ȧ�� ����?> " + odd);
		System.out.println("1 ~ 10 ������ ¦�� ����?> " + even);
	}
}
