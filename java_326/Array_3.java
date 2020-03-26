public class Array_3
{
	public static void main(String[] args) 
	{
		
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};

/*		for (int i = 0;i < month.length ; i++ )
		{
			System.out.println((i + 1)+ "월은" + month[i]+"일");
		}

*/

														// 향상된 for 문(배열이나 컬렉션에서만 가능)
		for (int ss : month )				// 배열 month의 모든 요소를 ss라 할때
		{												// month => 반복의 대상
			System.out.println(ss);		// ss가 의미하는 각각의 값을 출력
		}
	}
}
