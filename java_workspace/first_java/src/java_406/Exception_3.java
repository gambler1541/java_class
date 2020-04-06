package java_406;


public class Exception_3 {
	public static void main(String[] args) {
		
		try { 
			
			System.out.println("예외 발생 전 *******************************");
			throw new NumberFormatException(" 숫자가 아닙니다. ");
		}
		
		catch(NumberFormatException e) {
			
			System.out.println("내가 만든 예외 : " + e);
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
