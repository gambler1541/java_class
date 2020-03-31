package java_331;


class Car_2{
	
	
	String color;		// ��� ����
	String gearType;	// ��� ����
	int door;			// ��� ����
	
	
	
	public Car_2() {	// ������ 

		this("white","auto",4);
	}
	
	public Car_2(Car_2 c) { 	// �ν��Ͻ� ���縦 ���� ������
		
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
		Car_2 car2 = new Car_2(car1);	// car1�� ���纻�� car2�� ����
		
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
