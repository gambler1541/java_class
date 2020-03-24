public class  Switch_3
{
	public static void main(String[] args) 
	{
		int score = (int)(Math.random() * 100) + 1; // Math.random 0~9까지의 실수
		
		switch (score * 100)
		{
		case 100:
			System.out.println("당신의 점수는 100 상품은 자전거");
			break;
		case 200:
			System.out.println("당신의 점수는 200 상품은 TV");
			break;	
		case 300:
			System.out.println("당신의 점수는 300 상품은 노트북");
			break;
		case 400:
			System.out.println("당신의 점수는 400 상품은 자동차");
			break;
		default:
			System.out.println("죄송하지만 당신의 상품은 없습니다.");
			break;
		
		}
	}
}