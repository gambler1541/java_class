import java.io.*;

public class GuGuDan_2 
{
	public static void main(String[] args) throws Exception
	{
		int tmp;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("단수를 입력하세요:");
		int i = Integer.parseInt(in.readLine());
		System.out.print("단수를 입력하세요:");
		int j = Integer.parseInt(in.readLine());

		// Swap
		if (i >= j)
		{
			tmp = i;
			i = j;
			j = tmp;
		}
		
		System.out.println();
		for (int a= i; a<=j; a++ )
		{
			for (int b =1; b<=9; b++ )
			{
				System.out.println(a + "*" + b + "=" + (a*b));
			}
			System.out.println();
		}
	}
}
