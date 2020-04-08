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
		return "오늘은 보름날 ~~~";
	}
	
}

public class Object_1 {
	public static void main(String[] args) {
		
		Korea obj = new Korea();
		Korea obj2 = obj;
		Korea obj3 = new Korea();
		
		
		System.out.println(" 클래스 이름	: " + obj.getClass());
		System.out.println(" 해쉬 코드		: " + obj.hashCode());
		System.out.println(" 해쉬 코드		: " + obj2.hashCode());
		System.out.println(" 해쉬 코드		: " + obj3.hashCode());
		System.out.println(" 객체 문자열	: " + obj.toString());
		System.out.println(" 객체 문자열	: " + obj);
		
		if (obj.hashCode() == obj2.hashCode()) {
			System.out.println("obj 와 obj2 는 같다");
		}
		
		else {
			System.out.println("obj 와 obj2 는 다르다~~");
		}
		
		if (obj.hashCode() == obj3.hashCode()) {
			System.out.println("obj 와 obj3 는 같다");
		}
		
		else {
			System.out.println("obj 와 obj3 는 다르다~~");
		}
		
		
		
	}
}
