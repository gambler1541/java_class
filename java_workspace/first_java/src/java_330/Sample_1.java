package java_330;

public class Sample_1 {
	
	double x; // 멤버 변수 
	double y; // 멤버 변수
	
	
	public Sample_1(double a, double b) { // 생성자(클래스명과 동일하면서 return  타입이 없는것 = 생성자)
		x = a;
		y = b;
	}
	

	public double add() // 멤버 메서드 
	{
		return (x + y);
	}
	
	private double sub() // 멤버 메서드 
	{
		return (x - y);
	}
	
	private double mul() // 멤버 메서드 
	{
		return (x * y);
	}
	
	public double div() 
	{
		return (x / y);
	}
	
	
	
			
	public static void main(String[] args) {

		Sample_1 sample = new Sample_1(10.5, 23.7);
	

		System.out.println("덧셈한 결과 : " + sample.add());
		System.out.println("뺄셈한 결과 : " + sample.sub());
		System.out.println("곱셈한 결과 : " + sample.mul());
		System.out.println("나눗셈한 결과 : " + sample.div());
		
	}
	
}
