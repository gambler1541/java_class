package java_406;


class KimException extends Exception{		// ����� ����  Exception
	public KimException(String str) {
		super(str);
	}
}


public class Exception_6 {
	public static void main(String[] args) {
		try {
			
			int xy = 123;
			if (xy % 5 != 0) {
				throw new KimException("5�� ����� �ƴմϴ�.");
			}
			System.out.println("5�� ��� �Դϴ�.");
		}
		catch (KimException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
	}
}
