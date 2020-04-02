package java_402;


class 차
{
	
	
}

class 불자동차 extends 차
{
	
}

class 수륙양용차
{
	
}

public class InstanceofTest {
	public static void main(String[] args) {
		
		
		불자동차 obj = new 불자동차();
		
		수륙양용차 obj2 = new 수륙양용차();
		
		if (obj instanceof 불자동차) {
			
			System.out.println("This is a 불자동차 인스턴스~~~");
		}
		
		
		
		if (obj instanceof 차) {			
			System.out.println("This is a 차 인스턴스~~~");
		}
		
		if (obj instanceof Object) {
			System.out.println("This is a Object 인스턴스~~~");
		}
		
		if (obj2 instanceof 수륙양용차) {
			System.out.println("This is a 수륙양용차 인스턴스~~~");				
		}
	}
}
