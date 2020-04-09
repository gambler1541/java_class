package java_409;


class Person{
	
	long id;
	
	public boolean equals(Object obj) {
		
		if (obj != null && obj instanceof Person) {
			return id == ((Person)obj).id;	// obj 가 Object 타입이므로 id값을 참조하기 위해서는 Person 타입으로 형변환이 필요하다.
		}
		else {
			return false;		// 타입이 Person이 아니면 값을 비교할 필요가 없다.
		}
		
	}
	
	public Person(long id) {
		this.id = id;
		
	}
}



public class EqualsTest {
	public static void main(String[] args) {
		
		Person pp1 = new Person(202004090927L);
		Person pp2 = new Person(202004090927L);
	
		if (pp1 == pp2) {		// 주소 비교
			System.out.println("pp1과 pp2는 같은 사람입니다.");
		}
		
		else {
			System.out.println("pp1과 pp2는 다른 사람입니다.");
		}
		
		if (pp1.equals(pp2)) {	// 내용비교
			System.out.println("pp1과 pp2는 같같같은 사람입니다.");
		}
		else {
			System.out.println("pp1과 pp2는 다다다른 사람입니다.");
		}
	}
}
