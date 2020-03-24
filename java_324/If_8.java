public class If_8 
{
	public static void main(String[] args) 
	{
		int score = 0;

		for (int i = 1; i <= 100 ; i++ )
		{
			score = (int)((128-(-75)+1)*Math.random()+(-75));

			System.out.print("\t" +  score);

			if (i % 5 == 0)
			{
				System.out.println();
			}
		}





	}
}
