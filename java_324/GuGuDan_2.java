import java.io.*;

public class GuGuDan_2 
{
	public static void main(String[] args) throws Exception
	{
		int tmp;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�ܼ��� �Է��ϼ���:");
		int i = Integer.parseInt(in.readLine());
		System.out.print("�ܼ��� �Է��ϼ���:");
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
