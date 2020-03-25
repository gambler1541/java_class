import java.io.*;

public class DoWhile_2 
{
	public static void main(String[] args) throws IOException
	{
		int input = 0;

		System.out.println("문장을 입력하세요 !!");
		System.out.println("문장을 마치려면 x 를 누르세요 !!");
		

		do
		{
			input = System.in.read();
			System.out.print((char)input);
		}
		while (input !='x'
		);

	}
}
