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

		System.out.println("번호\t국어\t영어\t수학\t과학\t총점\t평균");
		System.out.println("======================================================");
		
		// for = 각 행을 순회
		for (int i = 0;i < score.length ; i++)
		{
			/*
			 {{100,100,100,100},
			  {20,20,20,20},
			  {30,30,30,30},
			  {40,40,40,40},
			  {50,50,50,50}};
			*/

			// sum 초기화
			int sum = 0;
			
			// 각 total변수에 모든 사람의 과목별 점수를 저장
			koreanTotal += score[i][0];
			englishTotal += score[i][1];
			mathTotal += score[i][2];
			scienceTotal += score[i][3];
			// 각 사람의 번호를 출력 => 1
			//									     2 
			System.out.print((i + 1) + "\t");
		

			for (int j = 0; j < score[i].length ; j++ )
			{	
				// 한 사람의 과목총점을 sum에 저장
				sum += score[i][j];
				// 한 사람의 각 과목의 점수를 출력
				System.out.print(score[i][j] + "\t");
			}

			// 평균값을 구함 i = 0일때 부터 score의 길이만큼(사람의 수만큼, 각 사람의 평균) 
			System.out.println(sum + "\t" + sum/(float)score[i].length);	
			
		}
		System.out.println("\n======================================================");
		// 각 과목별 모든 사람의 총점을 출력
		System.out.println("총 점"+"\t" + koreanTotal + "\t" + englishTotal + "\t" + mathTotal + "\t" + scienceTotal);
	}
}