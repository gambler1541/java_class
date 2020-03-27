public class Array_10 
{
	public static void main(String[] args) 
	{
		int[] number = {1,2,3,4,5};
		// int[] newNumber = new int[10];
		float[] newNumber2 = new float[10];

		for (int i=0; i < number.length; i++)
		{
			// newNumber[i] = number[i];
			 newNumber2[i] = number[i];
		}

		for (int i=0; i < newNumber2.length ; i++ )
		{
			// number[i] =  newnumber[i]( number배열에 있던 값(5개) , newnumber의 값(10개))로 인해 number값이 들어오고 나머진 0으로 채워짐
			// int배열에 기본 값은 0 이라는것을 알수있다.
			// System.out.print(newNumber[i] + "\t");
			System.out.print(newNumber2[i] + "\t");
		}
	}
}
