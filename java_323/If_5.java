import java.io.*;

public class If_5 
{
	public static void main(String[] args) throws Exception
	{


		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // �ѹ��� ��� ó��(Buffer)
		
		int grade = 0;

		System.out.println("������ �Է��ϼ��� !! ");

		grade = Integer.parseInt(in.readLine());
		char cc =  ' ';
		char opt = ' ';
		
		if (grade >= 90)
		{
			if (grade >= 97)
			{
				opt = '+';
			}
			else if (grade <= 93)
			{
				opt = '-';
			}
			cc = 'A';
		}

		else if (grade >= 80)
		{
			if (grade >= 87)
			{
				opt = '+';
			}
			else if (grade <= 83)
			{
				opt = '-';
			}
			cc = 'B';
		}
		
		else if (grade >= 70)
		{
			if (grade >= 77)
			{
				opt = '+';
			}
			else if (grade <= 73)
			{
				opt = '-';
			}
			cc = 'C';
		}
		
		else if (grade >= 60)
		{
			if (grade >= 67)
			{
				opt = '+';
			}
			else if (grade <= 63)
			{
				opt = '-';
			}
			cc = 'D';
		}

		else
		{
			cc = 'F';
		}


		System.out.println("������ " + cc + opt +(" �Դϴ�."));
	}
}
