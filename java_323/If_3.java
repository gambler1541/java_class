public class If_3 
{
	public static void main(String[] args) 
	{

		int grade = 85;
		char cc =  ' ';


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
