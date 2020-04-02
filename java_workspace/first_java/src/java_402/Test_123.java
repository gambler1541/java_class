package java_402;


class Aa{
	
	int a = 10;

}


class Bb extends Aa{
	
	int a= 20;

	}	

public class Test_123 {
	public static void main(String[] args) {
		Aa bb = new Bb();
		
		System.out.println(bb.a);
		
	}
}
