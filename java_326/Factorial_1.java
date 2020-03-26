import java.util.*;

public class Factorial_1 
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		
		long fact = 1;

		System.out.print(" 정수를 입력하세요:  ");
		int number = input.nextInt();
		
		for (int i = 1; i <= number ; i++ )
		{
			fact = fact * i;
		}

		System.out.printf("  %d! 는 %d 입니다.  ", number, fact);

	}
}
