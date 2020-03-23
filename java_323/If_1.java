public class If_1 
{
	public static void main(String[] args) throws Exception
	{
		int a;

		System.out.print("문자를 입력하세요: ");
		a = System.in.read();

		if ((a >= 'A') && (a <= 'Z') )
		{
			System.out.println((char)a + "는 대문자 입니다.");
		}
		else if ((a >= 'a') && (a <= 'z'))
		{
			System.out.println((char)a + "는 소문자 입니다.");
		}
		else if((a >= '0') && (a <= '9'))
		{
			System.out.println((char)a + "는 숫자 입니다.");	
		}
		else
		{
			System.out.println((char)a + "특수문자 입니다.");
		}
	}
}
