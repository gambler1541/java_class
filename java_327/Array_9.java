public class Array_9 
{
	public static void main(String[] args) 
	{
		
		int[][] score = {{33,33,31,32},
								 {18,42,75,100},
								 {36,48,24,13},
								 {65,24,40,78},
								 {77,45,24,98}};
								

		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int scienceTotal = 0;

		System.out.println("��ȣ\t����\t����\t����\t����\t����\t���");
		System.out.println("======================================================");
		
		// for = �� ���� ��ȸ
		for (int i = 0;i < score.length ; i++)
		{
			/*
			 {{100,100,100,100},
			  {20,20,20,20},
			  {30,30,30,30},
			  {40,40,40,40},
			  {50,50,50,50}};
			*/

			// sum �ʱ�ȭ
			int sum = 0;
			
			// �� total������ ��� ����� ���� ������ ����
			koreanTotal += score[i][0];
			englishTotal += score[i][1];
			mathTotal += score[i][2];
			scienceTotal += score[i][3];
			// �� ����� ��ȣ�� ��� => 1
			//									     2 
			System.out.print((i + 1) + "\t");
		

			for (int j = 0; j < score[i].length ; j++ )
			{	
				// �� ����� ���������� sum�� ����
				sum += score[i][j];
				// �� ����� �� ������ ������ ���
				System.out.print(score[i][j] + "\t");
			}

			// ��հ��� ���� i = 0�϶� ���� score�� ���̸�ŭ(����� ����ŭ, �� ����� ���) 
			System.out.println(sum + "\t" + sum/(float)score[i].length);	
			
		}
		System.out.println("\n======================================================");
		// �� ���� ��� ����� ������ ���
		System.out.println("�� ��"+"\t" + koreanTotal + "\t" + englishTotal + "\t" + mathTotal + "\t" + scienceTotal);
	}
}