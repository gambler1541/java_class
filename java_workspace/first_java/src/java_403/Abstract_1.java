package java_403;

abstract class ����{			// �߻� Ŭ����
	
	int i = 10;				// �ɹ� ����
	
	
	
	public void draw()
	
	{
		System.out.println("aa");
	}
	
	
}


class �簢�� extends ����{

	@Override
	public void draw() {
		System.out.println("�簢���� �׸��ϴ�.");
		
	}
	
	
}

class �ﰢ�� extends ����{

	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸��ϴ�.");
	}
}

class ���� extends ����{
	
	@Override
	public void draw() {
		System.out.println("���� �׸��ϴ�.");
	}
}

class ������ extends ����{
	
	@Override
	public void draw() {
		System.out.println("�������� �׸��ϴ�.");
	}
}

public class Abstract_1 {
	public static void main(String[] args) {
			
		�簢�� obj1 = new �簢��();
		�ﰢ�� obj2= new �ﰢ��();
		���� obj3 = new ����();
		������ obj4 = new ������();
		
		System.out.println();
		
		obj1.draw();
		obj2.draw();
		obj3.draw();
		obj4.draw();
		
		System.out.println("==================================================");
		
		���� obj5 = new �簢��();
		obj5.draw();
		
		obj5 = new �ﰢ��();
		obj5.draw();
		
		obj5 = new ����();
		obj5.draw();
		
		obj5 = new ������();
		obj5.draw();
		System.out.println("==================================================");
		
		
	}
}
