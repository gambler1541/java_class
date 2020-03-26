public class Array_7 
{
	public static void main(String[] args) 
	{
		int[] number = new int[10];
		
		for (int i = 0;i < number.length ; i++)
		{
			number[i] = i;
			System.out.print(number[i] + "\t");
		}
		System.out.println("\n");

		for (int i = 0;i < 100; i++ )
		{
			int nn = (int)(Math.random() * 10); // 0 ~ 9사이의 임의의 값
			int tmp = number[0];
			number[0] = number[nn];
			number[nn] = tmp;
		}

		for (int i = 0; i < number.length ; i++)
		{
			System.out.print(number[i] + "\t");
		}
	}
}
