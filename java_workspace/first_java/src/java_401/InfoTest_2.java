package java_401;

class Info2
{
	private String name;	// ��� ����
	private int age;
	private char sex;
	private String tel;
	
	public Info2(String n, int a, char s, String t) { // ������
		name = n;
		age = a;
		sex = s;
		tel = t;
	}
	
	public Info2(String n, int a, String t) {	// ������
		name = n;
		age = a;
		sex = 'f';
		tel = t;
		
	}
	
	public Info2(String n, char s, String t) { // ������
		name = n;
		age = 77;
		sex = s;
		tel = t;
	}	
	
	public Info2(int a, char s) { // ������
//		name = "Anonymous";
		age = a;
		sex = s;
		tel = "000-0000-0000";
		
	}
	
	public Info2() {	// ������
		name = "����";
		age = 33;
		sex = 'f';
		tel = "000-0000-0000";
	}
	
	public void display() { // ��� �޼ҵ�
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + sex );
		System.out.println("��ȭ��ȣ : " + tel + "\n");
	}
	
}

public class InfoTest_2 {
	public static void main(String[] args) {
		
		Info2 info1 = new Info2("ȫ�浿",35,'m', "010-2123-1234");		
		Info2 info2 = new Info2("�عٶ��",22, "010-4548-4544");		
		Info2 info3 = new Info2("�鱹ȭ",'f', "010-2323-2242");		
		Info2 info4 = new Info2(34,'m');		
		Info2 info5 = new Info2();		
		
		info1.display();
		info2.display();
		info3.display();
		info4.display();
		info5.display();
	}
}
