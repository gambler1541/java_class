package java_331;


class Car_2{
	
	
	String color;		// 멤버 변수
	String gearType;	// 멤버 변수
	int door;			// 멤버 변수
	
	
	
	public Car_2() {	// 생성자 

		this("white","auto",4);
	}
	
	public Car_2(Car_2 c) { 	// 인스턴스 복사를 위한 생성자
		
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	public Car_2(String c, String g, int d) {
		
		color = c;
		gearType = g;
		door = d;
	}
}




public class CarTest_2 {
	public static void main(String[] args) {
		
		Car_2 car1 = new Car_2();
		Car_2 car2 = new Car_2(car1);	// car1의 복사본을 car2에 저장
		
		System.out.println("car1 color: " + car1.color + 
						   "\tcar1 gearType: " +car1.gearType+
						   "\tcar1 door: " + car1.door);
		
		
		System.out.println("car2 color: " + car2.color + 
						   "\tcar2 gearType: " +car2.gearType+
						   "\tcar2 door: " + car2.door);
		
		
		car1.door = 457;
		
		System.out.println("=========================================");
		System.out.println("car1 color: " + car1.color + 
						   "\tcar1 gearType: " +car1.gearType+
						   "\tcar door: " + car1.door);
		
		
		System.out.println("car2 color: " + car2.color + 
						   "\tcar2 gearType: " +car2.gearType+
						   "\tcar2 door: " + car2.door);
	}
}
