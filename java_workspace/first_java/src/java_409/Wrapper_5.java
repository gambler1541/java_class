package java_409;

public class Wrapper_5 {
	public static void main(String[] args) {
		
		Boolean bool_1 = new Boolean(true);
		Boolean bool_2 = new Boolean("korea");
		
		if (bool_1.booleanValue()) {
			System.out.println("boo1_1 객체는		true	입니다.");
		}
		else {
			System.out.println("boo1_1 객체는		false	입니다.");
		}

		if (bool_2.booleanValue()) {
			System.out.println("boo1_2 객체는		true	입니다.");
		}
		else {
			System.out.println("boo1_2 객체는		false	입니다.");
		}
		
		
	}
}
