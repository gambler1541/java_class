public class Lotto_904 
{
	public static void main(String[] args) 
	{
		int[] ball = new int[45];

		for (int i =0;i < ball.length ; i++ )
		{
			ball[i] = i + 1;
		}

		int temp = 0;
		int j = 0;

		for (int i = 0;i < 500; i++ )
		{
			j = (int)(Math.random()*45);
			
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}


		System.out.println();
		System.out.println("\n  �� 904 ȸ�� �ζ� ��÷ ��ȣ !!!");

		for (int i = 0;i < 6 ; i++ )
		{
			System.out.print(ball[i] + "\t");
		}
		System.out.println("\n");
		System.out.println("\n ���ʽ� ��ȣ ");
		System.out.println("\t\t" + ball[6] + " �Դϴ�.\n\n ");


		System.out.println("\n");
	}
}
