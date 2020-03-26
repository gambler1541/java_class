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
			System.out.print("정답을 입력하세요> ");
			dapp = Integer.parseInt(input.readLine());
			count ++;
			if (dapp > answer)
			{
				System.out.println("숫자가 너무 큽니다.");
			}
			else if (dapp < answer)
			{
				System.out.println("숫자가 너무 작습니다.");
			}
			
		}
		while (dapp != answer);

		
		System.out.println("\n 정답입니다! 정답은> " + answer );
		System.out.println("시도 횟수 " + count );

	}

}
