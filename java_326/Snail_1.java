public class Snail_1

{
	public static void main(String[] args) 
	{
		
		/*
		13 미터 우물속에 달팽이가 있습니다.
		낮에 3미터를 오르고 밤에 1미터를 미끄러 집니다.
		이 달팽이가 우물을 벗어나는데는 몇일이 걸릴까요
		*/
		
		int count = 0;
		int snail = 0;

		while (true)
		{
			snail += 3;
			count ++;

			if (snail >= 13)
			{
				break;
			}

			snail -= 1;

		}

		System.out.println("오른 거리 : " + snail);
		System.out.println("걸린 날짜 : " + count);


	}
}
