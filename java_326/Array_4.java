public class Array_4 
{
	public static void main(String[] args) 
	{
		int[][] king = {
			{1,2},
			{3,4,},
			{5,6},
			{7,8}
		};
		
		int i, j;

		
		for (i = 0; i < king.length; i++ )
		{
			for (j = 0;j < king[i].length ; j++)
			{
				System.out.print("  " + king[i][j]);
			}
			System. out.println();
		}
	}
}
