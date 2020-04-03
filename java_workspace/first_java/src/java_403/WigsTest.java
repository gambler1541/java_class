package java_403;

interface Car
{
	void run();
}

interface Ship
{
	void navigation();
}

interface Mole
{
	void dig();
}

interface Teleportation
{
	void telpo();
}

interface Wigs extends Car, Ship, Mole, Teleportation
{
	
	void floating();
	
}


class EagleFive implements Wigs
{

	@Override
	public void run() 
	{
		System.out.println("평야를 달린다");
	}

	@Override
	public void navigation() 
	{
		System.out.println("대양을 항해한다");
	}

	@Override
	public void dig() 
	{
		System.out.println("땅속을 다닌다~~");
	}

	@Override
	public void floating() 
	{
		System.out.println("모래밭을 떠다닌다.");
	}

	@Override
	public void telpo() {
		System.out.println("순간이동을 한다");
	}
	
}




public class WigsTest {
	public static void main(String[] args) {
		
		Wigs obj = new EagleFive();		// 클래스객체를 인터페이스형식(타입)으로 넘겨줄수있다.
		
		obj.dig();
		obj.floating();
		obj.run();
		obj.navigation();
		obj.telpo();
	}
}
