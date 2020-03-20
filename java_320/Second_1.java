public class  Second_1
{
	public static void main(String[] args) throws Exception
	{
		int ch;
		
		System.out.print(" 0또는 1을 입력하세요 !");
		ch = System.in.read();

		if (ch == '0')
		{
			System.out.println(" 10/3 = " + (10 / 3));
		}
		else{
			System.out.println(" 10%3 = " + (10 % 3));
			}
	}
}
