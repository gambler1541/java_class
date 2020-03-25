import java.io.*;

public class  GuGuDan_6
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

		do
		{
			do
			{
				System.out.println(first + "*" + i +"=" + first * i);
				i++;
			}
			while (i <= 9);
			i =1;
			first++;
			System.out.println();
		}
		while (first <= second);
		

	}
}
