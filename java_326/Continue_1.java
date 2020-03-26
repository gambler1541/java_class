public class Continue_1

{
	public static void main(String[] args) 
	{
		int sum = 0;
		
		for (int i = 0; i < 10; i++)
		{
			if (i % 2 == 0)
			{
				continue;	// for문(반복문)의 끝으로 이동
			}
			sum += i;
			System.out.print(i + "\t" );
		}
		System.out.println(" sum  = " + sum);
	}
}
