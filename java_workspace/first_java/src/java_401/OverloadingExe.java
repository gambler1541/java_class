package java_401;

class Overloading{
	
	void display()	// �Ű����� ����
	{
		System.out.println("���޵� �� ����");
	}
	
	void display(int a)	// �Ű����� ������ 1��
	{
		System.out.println("���޵� ��(int):" + a);
	}
	
	void display(String name)	// �Ű����� ������ 1��
	{
		System.out.println("���޵� ��(string): " + name);
	}
	
	void display(String name, int age)	// ����, ���� �Ű����� 2��
	{
		System.out.println("���޵� ��(String, int): " + name +", "+ age);
	}
	
	void display(String name, int age, String a)	// ����, ���� �Ű����� 3��
	{
		System.out.println("���޵� ��(String, int, String): " + name +", "+ age + ", " + a);
	}
	
}


public class OverloadingExe {
	public static void main(String[] args) {
		
		Overloading over = new Overloading();
		
		over.display();
		over.display(27);
		over.display("������");
		over.display("����", 23);
		over.display("����", 23, "���ѹα�");
				
	}
}
