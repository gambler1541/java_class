public class  Array_8
{
	public static void main(String[] args) 
	{
		int[][] var = new int[3][]; // 가변 배열(다차원 배열에서 마지막을 비워둠)					
		int i,j,k = 0;

		// 비워둔 열에 각각 다른 갯수의 크기를 채움
		var[0] = new int[3];
		var[1] = new int[2];
		var[2] = new int[4];

		// 초기 값 입력
		for (i = 0; i < 3 ; i++)
		{
			for (j = 0; j < var[i].length; j++ )
			{
				var[i][j] = k ++;
			}
		}

		// 출력
		for (i = 0; i < var.length ; i++ )
		{
			for (j = 0; j < var[i].length ; j++ )
			{
				System.out.print(var[i][j] + "\t");
			}
				System.out.println();
		}
	}
}

