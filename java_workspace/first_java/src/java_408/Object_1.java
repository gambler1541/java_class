package java_408;

class Korea 
{
	String kbs;
	
	public Korea() {
		
	}
	
	public Korea(String kbs) {
		
		this.kbs = kbs;
	}
	
	public String toString()
	{
		return "������ ������ ~~~";
	}
	
}

public class Object_1 {
	public static void main(String[] args) {
		
		Korea obj = new Korea();
		
		System.out.println(" Ŭ���� �̸�	: " + obj.getClass());
		System.out.println(" �ؽ� �ڵ�		: " + obj.hashCode());
		System.out.println(" ��ü ���ڿ�	: " + obj.toString());
		System.out.println(" ��ü ���ڿ�	: " + obj);
		
	}
}
