import java.io.*;

public class DoWhile_2 
{
	public static void main(String[] args) throws IOException
	{
		int input = 0;

		System.out.println("������ �Է��ϼ��� !!");
		System.out.println("������ ��ġ���� x �� �������� !!");
		

		do
		{
			input = System.in.read();
			System.out.print((char)input);
		}
		while (input !='x'
		);

	}
}
