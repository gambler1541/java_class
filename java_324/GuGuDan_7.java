import java.io.*;

public class  GuGuDan_7
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;
		System.out.print("단수를 입력하세요:");
		int a = Integer.parseInt(in.readLine());
		int b = (int)((9 - 2 + 1) * Math.random() + 1);
		System.out.println("난수는 :" + b);

		if (a > b)
		{
			int tmp = a;
			a = b;
			b = tmp;
		}

		do
		{
			do
			{
				System.out.println(a + "*" + i +"=" + a * i);
				i++;
			}
			while (i <= 9);
			i =1;
			a++;
			System.out.println();
		}
		while (a <= b);
		

	}
}
