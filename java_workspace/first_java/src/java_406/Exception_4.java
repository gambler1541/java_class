package java_406;

import javax.naming.NoPermissionException;


public class Exception_4 {
	public static void main(String[] args) throws Exception {
		
		try { 
			
			Exception ex_1 = new NoPermissionException("벗꽃 만개 내가 만든 에러");
			throw ex_1;
		}
		
		catch (Exception e) {
		
			System.out.println("나의 에러: " + e);
			e.printStackTrace();
		}
		
		
	}
}
