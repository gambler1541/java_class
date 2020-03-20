public class  Arithmetic_2
{
	public static void main(String[] args) 
	{
		int a, b;

		a = 10;
		b = ++a;  // a = a + 1(연산 후 결과 대입)

		System.out.println("++a: " + a + " b: " + b);


		a = 10;
		b = a++;
		System.out.println("a++: "+a+" b: " + b);


		a = 10;
		b = --a; // a = a - 1
		System.out.println("--a: "+a+" b: " + b);
	
		
		a = 10;
		b = a--;
		System.out.println("a--: "+a+" b: " + b);
	}

}
