package java_401;


class StaticMethod{
	
	static int kor;		// ��������
	static int eng;
	static int math;

	
	
	
	static double average()
	{
		int total = kor + eng + math;
		return (total / 3.0);
	}
}




public class StaticMethodExe {
	public static void main(String[] args) {
		
		StaticMethod ssm = new StaticMethod();
		
		ssm.kor = 70;
		ssm.eng = 65;
		StaticMethod.math = 90;
		
		System.out.println("��� 11: " + ssm.average());
		System.out.println("��� 22: " + StaticMethod.average());
		
	}
}
