package java_403;
interface Speed{

	public int init_speed = 35;		//  public static final
public String init_direct = "Straight";

public void speedUp(int inc);	//  public abstract
public void speedDown(int inc);	
public void direct(String abc);

}
class Car_3 implements Speed{

	int speed = init_speed;
	String direct = init_direct;

	@Override
	public void speedUp(int inc) {	
		this.speed += inc;
	}

	@Override
	public void speedDown(int inc) {
		this.speed -= inc;
	}

	@Override
	public void direct(String abc) {

		this.direct = abc;
	}

	public void display(){
		System.out.println("현재 속도는 " + speed + " km/h 입니다.");
		System.out.println("현재 방향은 " + direct + " 입니다.");
	}


}




public class CarExe {
	public static void main(String[] args) {

		Car_3 obj = new Car_3();

		obj.speedUp(15);
		obj.speedUp(15);
		obj.direct("right");

		obj.display();

		obj.direct("left");
		obj.speedDown(10);
		obj.speedDown(10);

		obj.display();

	}
}
