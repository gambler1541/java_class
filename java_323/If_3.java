import java.io.*;

public class If_3 
{
	public static void main(String[] args) throws Exception
	{


		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // 한번에 묶어서 처리(Buffer)
		
		int grade = 0;

		System.out.println("점수를 입력하세요 !! ");

		grade = Integer.parseInt(in.readLine());
		char cc =  ' ';
		
ㅁ

		if (grade >= 90)
		{
			cc = 'A';
		}

		else if (grade >= 80)
		{
			cc = 'B';
		}
		
		else if (grade >= 70)
		{
			cc = 'C';
		}
		
		else if (grade >= 60)
		{
			cc = 'D';
		}

		else
		{
			cc = 'F';
		}


		System.out.println("성적은 " + cc +(" 입니다."));
	}
}
