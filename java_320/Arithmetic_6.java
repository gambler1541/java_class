public class Arithmetic_6 
{
	public static void main(String[] args) 
	{
		int a = 10, b = 4, c = 15;

		a += c + 5; // a = a + ( c + 5 )
		b *= c - 5; // b = b * ( c - 5) 
		// 대입 연산자의 우선순위가 낮음

		
		System.out.println(" a : " + a);
		System.out.println(" b : " + b);
	}
}
