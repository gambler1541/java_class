package java_403;

interface Bird{
	
	public long speed = 80;
	public void fly();
}

interface Horse{
	
	public void run(); 
}

interface Fish{
	
	public void swim();
}

class Pegasus implements Bird, Horse, Fish{

	@Override
	public void run() {
		System.out.println("��߸� �޸���");
	}

	@Override
	public void fly() {
		System.out.println("�ϴ��� ����");
	}

	@Override
	public void swim() {
		System.out.println("������ �ϴ�");
	}
	
	
}

public class ClassPaga {
	public static void main(String[] args) {
		
		Pegasus obj = new Pegasus();
		
		obj.fly();
		obj.run();
		obj.swim();
		
	}
}
