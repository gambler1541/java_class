import java.io.*;

public class  If_2
{
	public static void main(String[] args) throws Exception
	{

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int grade;

		System.out.println("성적을 입력하세요! ");

		grade = Integer.parseInt(in.readLine());
		
		if (grade >= 90)
		{
			System.out.println("성적은 A입니다.");
		}

		else if (grade >= 80)
		{
			System.out.println("성적은 B입니다.");
		}

		else if (grade >= 70)
		{
			System.out.println("성적은 C입니다.");
		}

		else if (grade >= 60)
		{
			System.out.println("성적은 D입니다.");
		}
		else
		{
			System.out.println("성적은 F입니다.");
		}
		
	}
}
