public class  Switch_3
{
	public static void main(String[] args) 
	{
		int score = (int)(Math.random() * 100) + 1; // Math.random 0~9������ �Ǽ�
		
		switch (score * 100)
		{
		case 100:
			System.out.println("����� ������ 100 ��ǰ�� ������");
			break;
		case 200:
			System.out.println("����� ������ 200 ��ǰ�� TV");
			break;	
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