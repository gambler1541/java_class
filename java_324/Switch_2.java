public class Switch_2 
{
	public static void main(String[] args) 
	{
		int score = 7;

		switch (score * 100)
		{
		case 100:
			System.out.println("����� ������ 100 ��ǰ�� ������");
		case 200:
			System.out.println("����� ������ 200 ��ǰ�� TV");
		case 300:
			System.out.println("����� ������ 300 ��ǰ�� ��Ʈ��");
			break;
		case 400:
			System.out.println("����� ������ 400 ��ǰ�� �ڵ���");
			break;
		default:
			System.out.println("�˼������� ����� ��ǰ�� �����ϴ�.");
			break;
		}
	}
}
