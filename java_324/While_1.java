public class While_1 
{
	public static void main(String[] args) 
	{
		int cnt = 0, sum = 0;
		

		// while���� ����� ���� �Һи���
		while (cnt <= 10)
		{
			sum += cnt;			
			cnt++;
		}

		System.out.println("1 ~ 10 ������ ����? > " + sum);
	}
}
