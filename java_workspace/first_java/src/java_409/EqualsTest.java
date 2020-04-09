package java_409;


class Person{
	
	long id;
	
	public boolean equals(Object obj) {
		
		if (obj != null && obj instanceof Person) {
			return id == ((Person)obj).id;	// obj �� Object Ÿ���̹Ƿ� id���� �����ϱ� ���ؼ��� Person Ÿ������ ����ȯ�� �ʿ��ϴ�.
		}
		else {
			return false;		// Ÿ���� Person�� �ƴϸ� ���� ���� �ʿ䰡 ����.
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
	
		if (pp1 == pp2) {		// �ּ� ��
			System.out.println("pp1�� pp2�� ���� ����Դϴ�.");
		}
		
		else {
			System.out.println("pp1�� pp2�� �ٸ� ����Դϴ�.");
		}
		
		if (pp1.equals(pp2)) {	// �����
			System.out.println("pp1�� pp2�� �������� ����Դϴ�.");
		}
		else {
			System.out.println("pp1�� pp2�� �ٴٴٸ� ����Դϴ�.");
		}
	}
}
