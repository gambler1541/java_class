import java.io.*;

public class GuGuDan_4
{
	public static void main(String[] args) throws Exception
	{

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int i = 1;

		System.out.print("단수를 입력하세요:");
		int first = Integer.parseInt(in.readLine());
		System.out.print("단수를 입력하세요:");
		int second = Integer.parseInt(in.readLine());
		
		if (first >= second)
		{
			int tmp = first;
			first = second;
			second = tmp;
		}
		int c = 2;

		while (first <= second)
		{	
			while (i <= 9)
			{
				System.out.println(first + "*" + i +"=" + first * i);
				i++;
			}

			i = 1;       
			first++;
			System.out.println();
		}
	}
}
