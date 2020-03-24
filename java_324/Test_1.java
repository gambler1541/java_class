public class  Test_1
{
	public static void main(String[] args) 
	{
		/*
		1 부터 100 사이에
		3과 7의 공배수의 합을 구하세요

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
		System.out.println("1~100 사이의 숫자에서 3과 7의 공배수의 합: " + sum);
	}
}
