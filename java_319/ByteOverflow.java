public class ByteOverflow 
{
	public static void main(String[] args) 
	{
		byte bb = 33;
		int ii = 33;
	
		for (int x = 0; x < 200; x++ )
		{
			System.out.print(bb++);
			System.out.print('\t');
			System.out.println(ii++);

		}
	}
}
