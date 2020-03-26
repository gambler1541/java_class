public class Array_5 
{
	public static void main(String[] args) 
	{
		int[]  kbs = new int[100];

		int kk = 0;

		for (int i = 0; i < 100 ;i++ )
		{
			kbs[i] = i +1;
			kk++;
			
			System.out.print(kbs[i] + "\t");

			if (kk % 5 ==0)
			{
				System.out.print("\n");
			}
		}
		System.out.println("kbs 배열의 크기 = "+ kbs.length);
	}
}
