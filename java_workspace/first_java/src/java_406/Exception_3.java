package java_406;


public class Exception_3 {
	public static void main(String[] args) {
		
		try { 
			
			System.out.println("���� �߻� �� *******************************");
			throw new NumberFormatException(" ���ڰ� �ƴմϴ�. ");
		}
		
		catch(NumberFormatException e) {
			
			System.out.println("���� ���� ���� : " + e);
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
