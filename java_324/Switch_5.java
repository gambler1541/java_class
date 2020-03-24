public class Switch_5 
{
	public static void main(String[] args) 
	{
		int score = (int)(Math.random() * 10) + 1;

		String msg = "";

		score *= 100;

		msg = "당신의 점수는 " + score + " 이고, 상품은 ";

		switch (score)
		{
		case 1000:
			msg +="자동차,"; 
		case 900:
			msg +="노트북, "; 
		case 800:
			msg +="TV, "; 
		case 700:
			msg +="자전거,"; 
			break; 
		default:
			msg += "볼펜, ";
			break;
		}

		System.out.println(msg + "입니다.");
	}
}
