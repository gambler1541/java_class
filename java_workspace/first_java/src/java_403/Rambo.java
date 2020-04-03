package java_403;

interface Knife{
	public void wield();
	
}

interface Bow{
	public void shoot_bow();
}

interface Gun{
	public void shoot_gun();
}


interface Rambo_1 extends Knife, Bow, Gun
{
	public void punch();
}



class Myengbae implements Rambo_1{
	
	String name;
	
	public Myengbae(String name) {
		this.name = name;
	}
	@Override
	public void wield() {
		System.out.println(this.name + " 칼을 휘두른다");
	}

	@Override
	public void shoot_bow() {
		System.out.println(this.name +" 활을 쏜다");
	}

	@Override
	public void shoot_gun() {
		System.out.println(this.name +" 총을 쏜다");
		
	}
	@Override
	public void punch() {
		System.out.println(this.name + " 주먹질을 한다");
		
	}
	
}

public class Rambo {
	public static void main(String[] args) {
		
		Rambo_1 obj = new Myengbae("박명배");	// 생성자도 메소드
	
//		obj.name;	// Rambo_1 타입이기때문에 변수는 섀도윙됨
		
		obj.shoot_bow();
		obj.shoot_gun();
		obj.wield();
		obj.punch();
	}
}
