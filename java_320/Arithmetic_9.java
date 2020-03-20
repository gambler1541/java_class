public class Arithmetic_9 
{
	public static void main(String[] args) 
	{
		char c1 = 'a';
		char c2 = c1;
		char c3 = ' ';

		int i = c1 + 1;

		c3 = (char)(c1 + 1); // int연산에는 char값이 들어갈 수 없다.(형변환)
		c2++; // ++연산에서는 형변환이 필요없음
		c2++;
		
		System.out.println(" i = " + i);
		System.out.println(" c2 = " + c2);
		System.out.println(" c3 = " + c3);
	}
}
