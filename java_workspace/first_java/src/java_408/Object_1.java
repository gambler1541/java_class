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
		Korea obj2 = obj;
		Korea obj3 = new Korea();
		
		
		System.out.println(" Ŭ���� �̸�	: " + obj.getClass());
		System.out.println(" �ؽ� �ڵ�		: " + obj.hashCode());
		System.out.println(" �ؽ� �ڵ�		: " + obj2.hashCode());
		System.out.println(" �ؽ� �ڵ�		: " + obj3.hashCode());
		System.out.println(" ��ü ���ڿ�	: " + obj.toString());
		System.out.println(" ��ü ���ڿ�	: " + obj);
		
		if (obj.hashCode() == obj2.hashCode()) {
			System.out.println("obj �� obj2 �� ����");
		}
		
		else {
			System.out.println("obj �� obj2 �� �ٸ���~~");
		}
		
		if (obj.hashCode() == obj3.hashCode()) {
			System.out.println("obj �� obj3 �� ����");
		}
		
		else {
			System.out.println("obj �� obj3 �� �ٸ���~~");
		}
		
		
		
	}
}
