public class Test_2

{
	public static void main(String[] args) 
	{
		int a = 0;
		int today = 1;
	
		while (true)
		{
			
			a += 3;
			System.out.println( today  + "일날  아침" + a);

			if (a >= 13)
			{
				break;
			}
		
			a -= 1;
			System.out.println( today  + "일날  저녁" + a);
			
			today +=1;
			
		}
		System.out.println("total today: " + today);
	}
}
