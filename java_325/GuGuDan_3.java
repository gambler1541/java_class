import java.io.*;

public class GuGuDan_3 
{
	public static void main(String[] args) 
	{
		int first = 2, second = 1;

		while (first <= 9)
		{
			
			while (second <= 9)
			{
				System.out.println(first + "*" + second +"=" + first * second);
				second++;
			}

			second = 1;        // second값이 첫 while문(second)을 나왔을때의 값이 저장되어있기 때문에 초기화 시켜줌
										// 그렇지 않으면 두번째 while문에서 이미 저장된 second값(11)때문에 while문이 실행되지 않음
			first++;
			System.out.println();
		}
	}
}
