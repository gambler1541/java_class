package java_420;


class Data{
	int x;
}


public class Data_1 {
	public static void main(String[] args) {
		Data d = new Data();
		Object obj = new Data();
		
		if (d instanceof Data) {
			System.out.println("d�� Data�� ��ü�̴�");
		}
		else {
			System.out.println("�ƴϴ�");
		}
		
		if (obj instanceof Data) {
			System.out.println("d�� Data�� ��ü�̴�");
		}
		else {
			System.out.println("�ƴϴ�");
		}
	}
	
}
