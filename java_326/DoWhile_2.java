import java.io.*;

public class DoWhile_2 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		int answer = (int)((120 - 50 + 1) * Math.random() + 50);
		int dapp = 0;
		int count = 0;

		do
		{
			System.out.print("������ �Է��ϼ���> ");
			dapp = Integer.parseInt(input.readLine());
			count ++;
			if (dapp > answer)
			{
				System.out.println("���ڰ� �ʹ� Ů�ϴ�.");
			}
			else if (dapp < answer)
			{
				System.out.println("���ڰ� �ʹ� �۽��ϴ�.");
			}
			
		}
		while (dapp != answer);

		
		System.out.println("\n �����Դϴ�! ������> " + answer );
		System.out.println("�õ� Ƚ�� " + count );

	}

}
