public class For_2 
{
	public static void main(String[] args) 
	{
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 2000000 ; i++ )
		{
			for (int k = 0; k < 1500 ; k++ )
			{
				for (int j = 0; j < 2000 ; j++ )
				{
					; // 공문
				}
			}
		}

		long endTime = System.currentTimeMillis();
		
		System.out.println("시작 시간 : " + startTime);
		System.out.println("종료 시간 : " + endTime);
		System.out.println("소요 시간 : " + (endTime - startTime));



	}
}
