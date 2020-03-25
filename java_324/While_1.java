public class While_1 
{
	public static void main(String[] args) 
	{
		int cnt = 0, sum = 0, odd = 0, even = 0;
		

		// while문은 몇번을 돌지 불분명함
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
		System.out.println("1 ~ 10 까지의 합은?> " + sum);
		System.out.println("1 ~ 10 까지의 홀수 합은?> " + odd);
		System.out.println("1 ~ 10 까지의 짝수 합은?> " + even);
	}
}
