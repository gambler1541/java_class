public class Switch_5 
{
	public static void main(String[] args) 
	{
		int score = (int)(Math.random() * 10) + 1;

		String msg = "";

		score *= 100;

		msg = "����� ������ " + score + " �̰�, ��ǰ�� ";

		switch (score)
		{
		case 1000:
			msg +="�ڵ���,"; 
		case 900:
			msg +="��Ʈ��, "; 
		case 800:
			msg +="TV, "; 
		case 700:
			msg +="������,"; 
			break; 
		default:
			msg += "����, ";
			break;
		}

		System.out.println(msg + "�Դϴ�.");
	}
}
