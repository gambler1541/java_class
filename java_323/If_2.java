import java.io.*;

public class  If_2
{
	public static void main(String[] args) throws Exception
	{

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int grade;

		System.out.println("������ �Է��ϼ���! ");

		grade = Integer.parseInt(in.readLine());
		
		if (grade >= 90)
		{
			System.out.println("������ A�Դϴ�.");
		}

		else if (grade >= 80)
		{
			System.out.println("������ B�Դϴ�.");
		}

		else if (grade >= 70)
		{
			System.out.println("������ C�Դϴ�.");
		}

		else if (grade >= 60)
		{
			System.out.println("������ D�Դϴ�.");
		}
		else
		{
			System.out.println("������ F�Դϴ�.");
		}
		
	}
}
