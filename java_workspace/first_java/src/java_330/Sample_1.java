package java_330;

public class Sample_1 {
	
	double x; // ��� ���� 
	double y; // ��� ����
	
	
	public Sample_1(double a, double b) { // ������(Ŭ������� �����ϸ鼭 return  Ÿ���� ���°� = ������)
		x = a;
		y = b;
	}
	

	public double add() // ��� �޼��� 
	{
		return (x + y);
	}
	
	private double sub() // ��� �޼��� 
	{
		return (x - y);
	}
	
	private double mul() // ��� �޼��� 
	{
		return (x * y);
	}
	
	public double div() 
	{
		return (x / y);
	}
	
	
	
			
	public static void main(String[] args) {

		Sample_1 sample = new Sample_1(10.5, 23.7);
	

		System.out.println("������ ��� : " + sample.add());
		System.out.println("������ ��� : " + sample.sub());
		System.out.println("������ ��� : " + sample.mul());
		System.out.println("�������� ��� : " + sample.div());
		
	}
	
}
