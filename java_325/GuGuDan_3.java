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

			second = 1;        // second���� ù while��(second)�� ���������� ���� ����Ǿ��ֱ� ������ �ʱ�ȭ ������
										// �׷��� ������ �ι�° while������ �̹� ����� second��(11)������ while���� ������� ����
			first++;
			System.out.println();
		}
	}
}
