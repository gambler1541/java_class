package java_330;


class Car{
	
	String color;	// ����
	String gearType; // ���ӱ� ���� - auto => �ڵ�, manual => ����
	int door; // ���� ����
	int direct_1;
	
	
	// default ������
	public Car()
	{
		
	}
	
	// �������� �����ε�
	// �������� �̸��� ������ �Ű������� ����, Ÿ���� �ٸ�
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
			return "����";
		}
		else if (direct_1 == 2)
		{
			return "������";
		}
		else if (direct_1 == 3)
		{
			return "����";
		}
		else
		{
			return "����";
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
		System.out.println("car1�� " + car1.direct() + " ���� ���ϴ�.");
		System.out.println("car2�� " + car2.direct()+ " ���� ���ϴ�.");
	}
}
