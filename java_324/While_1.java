public class While_1 
{
	public static void main(String[] args) 
	{
		int cnt = 0, sum = 0;
		

		// while문은 몇번을 돌지 불분명함
		while (cnt <= 10)
		{
			sum += cnt;			
			cnt++;
		}

		System.out.println("1 ~ 10 까지의 합은? > " + sum);
	}
}
