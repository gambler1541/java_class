package java_331;


class Info
{
	private String name;	// ��� ����	�̸� �⺻�� : null
	private int age;		// 			���� �⺻�� : 0		
	private char sex;		// ����
	private String tel;
	private String address;
//
//	public Info(String n, int a, char s, String tel, String address) {		// ������
//		name = n;
//		age = a;
//		sex = s;
//		this.tel = tel;
//		this.address = address;
//	}
//	
	
	public void display()		// �޼���
	{

		System.out.println("�̸�:  " + name);
		System.out.println("����:  " + age);
		
		if (sex == 'f') {
			System.out.println("����:  " + sex + " ���� �Դϴ�.");
		}
		else if(sex == 'm')
		{
			System.out.println("����:  " + sex + " ���� �Դϴ�.");
		}
		else
		{
			System.out.println("����: ����� �ƴմϴ�.");
		}
		System.out.println("��ȣ : " + tel);
		System.out.println("�ּ� : " + address);
		
		
	}
		
}

public class InfoExe {
	public static void main(String[] args) {
		
		
	
//		Info info1 = new Info("����ȭ", 20, 'f', "010-4548-4844","���� ���Ǳ� �Ÿ���");		// info1 �ʱ�ȭ (name = ����ȭ, age = 20, sex = f)
//		Info info2 = new Info("���", 15, 'm', "010-4471-0242", "�λ� ���ϱ� �帲�� ");		// info2 �ʱ�ȭ(name = ���, age = 15, sex =m)
//		Info info3 = new Info("�ѱ�", 15, 't', "010-3121-1114","���� ������ ������");		// info2 �ʱ�ȭ
		
		Info info1 = new Info();
		Info info2 = new Info();
		Info info3 = new Info();
		
		
		info1.display();	// info1 ȭ�� ���
		System.out.println();
		info2.display();	// info2 ȭ�����
		System.out.println();
		info3.display();	// info3 ȭ�����
		
	}
}
