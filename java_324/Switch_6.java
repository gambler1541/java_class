import java.io.*;

public class Switch_6
{
	public static void main(String[] args) throws Exception
	{
		char grade;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �Է��ϼ���: ");
		int score = Integer.parseInt(in.readLine());
	
		switch (score / 10)
		{
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}

		System.out.println("����� ������" + grade + "�Դϴ�.");
	}
}


