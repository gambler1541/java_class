package java_403;

abstract class 도형{			// 추상 클래스
	
	int i = 10;				// 맴버 변수
	
	
	
	public void draw()
	
	{
		System.out.println("aa");
	}
	
	
}


class 사각형 extends 도형{

	@Override
	public void draw() {
		System.out.println("사각형을 그립니다.");
		
	}
	
	
}

class 삼각형 extends 도형{

	@Override
	public void draw() {
		System.out.println("삼각형을 그립니다.");
	}
}

class 원형 extends 도형{
	
	@Override
	public void draw() {
		System.out.println("원을 그립니다.");
	}
}

class 오각형 extends 도형{
	
	@Override
	public void draw() {
		System.out.println("오각형을 그립니다.");
	}
}

public class Abstract_1 {
	public static void main(String[] args) {
			
		사각형 obj1 = new 사각형();
		삼각형 obj2= new 삼각형();
		원형 obj3 = new 원형();
		오각형 obj4 = new 오각형();
		
		System.out.println();
		
		obj1.draw();
		obj2.draw();
		obj3.draw();
		obj4.draw();
		
		System.out.println("==================================================");
		
		도형 obj5 = new 사각형();
		obj5.draw();
		
		obj5 = new 삼각형();
		obj5.draw();
		
		obj5 = new 원형();
		obj5.draw();
		
		obj5 = new 오각형();
		obj5.draw();
		System.out.println("==================================================");
		
		
	}
}
