package java_330;


class Car{
	
	String color;	// 색상
	String gearType; // 변속기 종류 - auto => 자동, manual => 수동
	int door; // 도어 갯수
	int direct_1;
	
	
	// default 생성자
	public Car()
	{
		
	}
	
	// 생성자의 오버로딩
	// 생성자의 이름은 같지만 매개변수의 갯수, 타입이 다름
	public Car(String c, String g, int d)
	{
		color = c;
		gearType = g;
		door = d;
		
	}
	
	public String direct()
	{
		direct_1 = (int)(Math.random()*4+1); 
		
		if (direct_1 == 1) 
		{
			return "왼쪽";
		}
		else if (direct_1 == 2)
		{
			return "오른쪽";
		}
		else if (direct_1 == 3)
		{
			return "전진";
		}
		else
		{
			return "후진";
		}
		
	}
}

public class CarTest {
	public static void main(String[] args) {
	
		Car car1 = new Car();
		
		car1.color = "white";
		car1.gearType = "auto";
		car1.door = 5;
		
		
		Car car2 = new Car("red", "manual", 3);
		
		System.out.println(" car1 color: " +car1.color+"	car1 gearType: " + car1.gearType + "	car1 door: " + car1.door);
		System.out.println(" car2 color: " +car2.color+"	car2 gearType: " + car2.gearType + "	car2 door: " + car2.door);
		System.out.println("car1는 " + car1.direct() + " 으로 갑니다.");
		System.out.println("car2는 " + car2.direct()+ " 으로 갑니다.");
	}
}
