import java.io.*;

public class If_3 
{
	public static void main(String[] args) throws Exception
	{


		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // �ѹ��� ��� ó��(Buffer)
		
		int grade = 0;

		System.out.println("������ �Է��ϼ��� !! ");

		grade = Integer.parseInt(in.readLine());
		char cc =  ' ';
		
��

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


		System.out.println("������ " + cc +(" �Դϴ�."));
	}
}
