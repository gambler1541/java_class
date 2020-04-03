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
		System.out.println("평야를 달린다");
	}

	@Override
	public void fly() {
		System.out.println("하늘을 날다");
	}

	@Override
	public void swim() {
		System.out.println("수영을 하다");
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
