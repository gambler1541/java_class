public class Array_6 
{
	public static void main(String[] args) 
	{
		int[] score = {31,45,89,29,32,53,99,76};
		
		int max = score[0];
		int min = score[0];

		for (int i= 1;i < score.length; i++)
		{

			if (score[i] > max)
			{
				max = score[i];
			}

			if (score[i] < min)
			{
				min = score[i];
			}
		
		}

		System.out.println("가장 큰 값> " + max);
		System.out.println("가장 작은 값> " + min);

	}
}
