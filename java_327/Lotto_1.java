public class Lotto_1 
{
	public static void main(String[] args) 
	{
		
		int[] number =new int[45];

		int j;
		int tmp;

		
		System.out.println("��÷ ��ȣ��?");
		for (int i = 0; i <= 44 ; i++ )
		{
			number[i] = i + 1;
		}

		for (int i =0; i < 100;i++)
		{
			j = (int)((44-1+1) * Math.random() + 1);
			tmp = number[0];
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
