package java_408;


class Seoul { 
	
	int number;
	
	public Seoul(int num) {

		number = num;
	}
	
}

public class Equals_1 {
	public static void main(String[] args) {
		
		
		String obj1  = "Korea seoul";
		String obj2 = "Korea seoul";
		String obj3 = new String("Korea seoul");
		
		if (obj1.equals(obj2)) {
			System.out.println("obj1 �� obj2 �� ����");
		}
		else {
			System.out.println("obj1 �� obj2 �� �ٴٸ���");
		}
		
		
		if (obj1 == obj2) {
			System.out.println("obj1 �� obj2 �� ����");
		}
		else {
			System.out.println("obj1 �� obj2 �� �ٴٸ���");
		}
		
		if (obj1.equals(obj3)) {
			System.out.println("obj1 �� obj3 �� ����");
		}
		else {
			System.out.println("obj1 �� obj3 �� �ٴٴٸ���");
		}
		
		
		if (obj1 == obj3) {
			System.out.println("obj1 �� obj3 �� ����");
		}
		else {
			System.out.println("obj1 �� obj3 �� �ٴٴٸ���");
		}
		
		
		System.out.println("obj1 : " + obj1.hashCode());
		System.out.println("obj2 : " + obj2.hashCode());
		System.out.println("obj3 : " + obj3.hashCode());
		
	}
}
