public class Switch_1 
{
	public static void main(String[] args) throws Exception
	{
		
		int a;

		System.out.print("1 ~ 9 ������ ���� �Է��ϼ���: ");

		a = System.in.read()-'0';


		/* 
			Switch ���� ���� ������ ������ �ڷ�(��������) �̾�� �Ѵ�.

			. case ���� ���Ǵ� ���� ������ �Ѱ��� ���� ����Ҽ� �ִ�.
			. if �� ó�� �� ���� ����Ҽ� ����.
			. case ���� ���๮�� ������ ��������
						�߰�ȣ ( { } )�� ������� �ʴ´�.
			. break ���� ������ ���� case ������ �Ѿ��.
		

		*/

		switch (a)
		{
		case 1:
			System.out.println(a + "�� Ȧ�� �Դϴ�. ");
			break;
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println(a + "�� Ȧ�� �Դϴ�. ");
			break;

		case 2:
		case 4:
		case 6:
		case 8:
			System.out.println(a + "�� ¦�� �Դϴ�. ");
			break;

		default:
			System.out.println(a + "���� �Դϴ�.");
			break;
			}

	}
}
