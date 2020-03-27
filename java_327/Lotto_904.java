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
		System.out.println("\n  제 904 회차 로또 당첨 번호 !!!");

		for (int i = 0;i < 6 ; i++ )
		{
			System.out.print(ball[i] + "\t");
		}
		System.out.println("\n");
		System.out.println("\n 보너스 번호 ");
		System.out.println("\t\t" + ball[6] + " 입니다.\n\n ");


		System.out.println("\n");
	}
}
