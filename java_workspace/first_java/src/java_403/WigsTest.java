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
		System.out.println("��߸� �޸���");
	}

	@Override
	public void navigation() 
	{
		System.out.println("����� �����Ѵ�");
	}

	@Override
	public void dig() 
	{
		System.out.println("������ �ٴѴ�~~");
	}

	@Override
	public void floating() 
	{
		System.out.println("�𷡹��� ���ٴѴ�.");
	}

	@Override
	public void telpo() {
		System.out.println("�����̵��� �Ѵ�");
	}
	
}




public class WigsTest {
	public static void main(String[] args) {
		
		Wigs obj = new EagleFive();		// Ŭ������ü�� �������̽�����(Ÿ��)���� �Ѱ��ټ��ִ�.
		
		obj.dig();
		obj.floating();
		obj.run();
		obj.navigation();
		obj.telpo();
	}
}
