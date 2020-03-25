public class DoWhile_1 
{
	public static void main(String[] args) 
	{
		int cnt = 1, sum = 0;
		int odd =0, even = 0;

		do
		{
			if (cnt % 2 == 0)
			{
				even += cnt;
			}
			else
			{
				odd += cnt;
			}
			sum += cnt;
			cnt++;
		}
		while (cnt <= 10);
		
		System.out.println("1 ~ 10까지의 합: " + sum);
		System.out.println("1 ~ 10까지의 짝수 합:  " + even);
		System.out.println("1 ~ 10까지의 홀수 합:  " + odd);
	}
}
