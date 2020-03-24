public class If_7 
{
	public static void main(String[] args) throws Exception
	{
		
		int ch;

		System.out.print("문자를 입력하세요: ");

		ch = System.in.read();

		if (ch == 'A' || ch == 'a')
		{
			System.out.println("America");
			System.out.println("Austraila");
		}

		else if (ch == 'K' || ch == 'k')
		{
			System.out.println("Korea");
			System.out.println("Kuwait");
		}

		else if (ch == 'M' || ch == 'm')
		{
			System.out.println("Mexico");
			System.out.println("Monaco");
		}






	}
}
