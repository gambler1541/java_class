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
			// number[i] =  newnumber[i]( number�迭�� �ִ� ��(5��) , newnumber�� ��(10��))�� ���� number���� ������ ������ 0���� ä����
			// int�迭�� �⺻ ���� 0 �̶�°��� �˼��ִ�.
			// System.out.print(newNumber[i] + "\t");
			System.out.print(newNumber2[i] + "\t");
		}
	}
}
