public class If_1 
{
	public static void main(String[] args) throws Exception
	{
		int a;

		System.out.print("���ڸ� �Է��ϼ���: ");
		a = System.in.read();

		if ((a >= 'A') && (a <= 'Z') )
		{
			System.out.println((char)a + "�� �빮�� �Դϴ�.");
		}
		else if ((a >= 'a') && (a <= 'z'))
		{
			System.out.println((char)a + "�� �ҹ��� �Դϴ�.");
		}
		else if((a >= '0') && (a <= '9'))
		{
			System.out.println((char)a + "�� ���� �Դϴ�.");	
		}
		else
		{
			System.out.println((char)a + "Ư������ �Դϴ�.");
		}
	}
}
