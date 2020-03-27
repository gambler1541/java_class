public class Lotto_1 
{
	public static void main(String[] args) 
	{
		
		int[] number =new int[45];

		
		System.out.println("당첨 번호는?");
		for (int i = 0; i <= 44 ; i++ )
		{
			number[i] = i + 1;
		}

		for (int i =0; i < 100;i++)
		{
			int j = (int)((44-1+1) * Math.random() + 1);
			int tmp = number[0];
			number[0] = number[j];
			number[j] = tmp;
		}


		for (int i =1; i <= 6; i++ )
		{
			System.out.printf("%d\t",number[i]);
		}
		System.out.println();
	}
}
