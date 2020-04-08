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
			System.out.println("obj1 과 obj2 는 같다");
		}
		else {
			System.out.println("obj1 과 obj2 는 다다르다");
		}
		
		
		if (obj1 == obj2) {
			System.out.println("obj1 과 obj2 는 같다");
		}
		else {
			System.out.println("obj1 과 obj2 는 다다르다");
		}
		
		if (obj1.equals(obj3)) {
			System.out.println("obj1 과 obj3 는 같다");
		}
		else {
			System.out.println("obj1 과 obj3 는 다다다르다");
		}
		
		
		if (obj1 == obj3) {
			System.out.println("obj1 과 obj3 는 같다");
		}
		else {
			System.out.println("obj1 과 obj3 는 다다다르다");
		}
		
		
		System.out.println("obj1 : " + obj1.hashCode());
		System.out.println("obj2 : " + obj2.hashCode());
		System.out.println("obj3 : " + obj3.hashCode());
		
	}
}
