public class  If_2
{
	public static void main(String[] args) 
	{
		int grade = 85;

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
