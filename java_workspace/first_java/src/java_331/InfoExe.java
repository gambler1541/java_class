package java_331;


class Info
{
	private int key;
	private String name;	// ��� ����	�̸� �⺻�� : null
	private int age;		// 			���� �⺻�� : 0		
	private char sex;		// ����
	private String tel;
	private String address;
	private String h;

	public Info(String n, int a, char s, String tel, String address, String ho, int k) {		// ������
		name = n;
		age = a;
		sex = s;				
		this.tel = tel;
		this.address = address;
		h = ho;
		key = k;
}
	

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
		System.out.println("��� : " + h);
		System.out.println("Ű    : " + key);
		
		
	}
		
}

public class InfoExe {
	public static void main(String[] args) {
		
		Info  info1 = new Info("����ȭ", 20, 'f', "010-4548-4844","���� ���Ǳ� �Ÿ���","������Ÿ��", 170);	// info1 �ʱ�ȭ (name = ����ȭ, age = 20, sex = f)
		
		Info  info2 = new Info("���", 15, 'm', "010-4471-0242", "�λ� ���ϱ� �帲��", "��ǻ��", 165);		// info2 �ʱ�ȭ(name = ���, age = 15, sex =m)
	
		Info  info3 = new Info("�ѱ�", 15, 't', "010-3121-1114","���� ������ ������","����", 122);			// info2 �ʱ�ȭ
	
	
		
	
		

	
		
		info1.display();	// info1 ȭ�� ���
		System.out.println();
		info2.display();	// info2 ȭ�����
		System.out.println();
		info3.display();	// info3 ȭ�����

	
	}
}
