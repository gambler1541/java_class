package java_406;


class KimException extends Exception{		// 사용자 정의  Exception
	public KimException(String str) {
		super(str);
	}
}


public class Exception_6 {
	public static void main(String[] args) {
		try {
			
			int xy = 123;
			if (xy % 5 != 0) {
				throw new KimException("5의 배수가 아닙니다.");
			}
			System.out.println("5의 배수 입니다.");
		}
		catch (KimException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
	}
}
