public class ConditionalOperator 
{
	public static void main(String[] args) 
	{
		int a = 14, b = 21, c = 17, d = 56;

		int max, min;

		max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		max = (max > d) ? max : d;
		
		min = (a < b) ? a : b;
		min = (min < c) ? min : c;
		min = (min < d) ? min : d;


		System.out.println("���� ū ��: " + max);
		System.out.println("���� ���� ��: " + min);
	}
}
