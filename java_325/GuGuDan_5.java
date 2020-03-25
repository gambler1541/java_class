public class GuGuDan_5 
{
	public static void main(String[] args) 
	{
		int first = 2;
		int second = 1;

		do
		{
			do
			{
				System.out.println(first + "*" + second + "=" + first*second);
				second ++;
			}
			while (second <= 9);

			second = 1;
			first ++;
			System.out.println();

		}
		while (first <= 9);
	}
}
