package java_402;


class ��
{
	
	
}

class ���ڵ��� extends ��
{
	
}

class ���������
{
	
}

public class InstanceofTest {
	public static void main(String[] args) {
		
		
		���ڵ��� obj = new ���ڵ���();
		
		��������� obj2 = new ���������();
		
		if (obj instanceof ���ڵ���) {
			
			System.out.println("This is a ���ڵ��� �ν��Ͻ�~~~");
		}
		
		
		
		if (obj instanceof ��) {			
			System.out.println("This is a �� �ν��Ͻ�~~~");
		}
		
		if (obj instanceof Object) {
			System.out.println("This is a Object �ν��Ͻ�~~~");
		}
		
		if (obj2 instanceof ���������) {
			System.out.println("This is a ��������� �ν��Ͻ�~~~");				
		}
	}
}
