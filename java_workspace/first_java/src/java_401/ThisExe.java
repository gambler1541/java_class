package java_401;

class This_1{
	
	private int kor;
	private int eng;
	private int math;
	
	public This_1(int kor, int eng, int math) {
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	
	public int total(){
		
		return (this.kor + this.eng + this.math);

	}
	
	
}

public class ThisExe {
	public static void main(String[] args) {
		
		This_1 this_1 = new This_1(100, 70, 70);
		
		System.out.println("гу╟Х: " + this_1.total());
		
	}
}
