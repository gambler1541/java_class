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
					; // ����
				}
			}
		}

		long endTime = System.currentTimeMillis();
		
		System.out.println("���� �ð� : " + startTime);
		System.out.println("���� �ð� : " + endTime);
		System.out.println("�ҿ� �ð� : " + (endTime - startTime));



	}
}
