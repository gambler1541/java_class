public class Arithmetic_9 
{
	public static void main(String[] args) 
	{
		char c1 = 'a';
		char c2 = c1;
		char c3 = ' ';

		int i = c1 + 1;

		c3 = (char)(c1 + 1); // int���꿡�� char���� �� �� ����.(����ȯ)
		c2++; // ++���꿡���� ����ȯ�� �ʿ����
		c2++;
		
		System.out.println(" i = " + i);
		System.out.println(" c2 = " + c2);
		System.out.println(" c3 = " + c3);
	}
}
