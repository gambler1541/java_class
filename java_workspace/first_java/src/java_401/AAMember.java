package java_401;

class AA_1
{
	int aa = 25;
	class BB_1
	{
		final static double PI = 3.14152;
		int bb = aa + 10;
	}

}



public class AAMember {
	public static void main(String[] args) {
		
		AA_1 obj = new AA_1();
		
		AA_1.BB_1 bb;
		
		bb = obj.new BB_1();
		
		
		System.out.println("" + AA_1.BB_1.PI);
		System.out.println("BB 클래스 내부 변수 bb = " + bb.bb );
		
		
	}
}
