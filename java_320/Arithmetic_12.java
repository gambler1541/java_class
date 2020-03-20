public class Arithmetic_12
{
	public static void main(String[] args) 
	{
		int a,b,c;


		a = 13;
		b = 10;

		c = a & b;
		System.out.println(" a & b = " + c);
				
		c = a | b;
		System.out.println(" a | b = " + c);
			
		c = a ^ b;
		System.out.println(" a ^ b = " + c);

		c = ~(~a);
		System.out.println(" ~a = " + c);

	}
}
