package java_406;

import javax.naming.NoPermissionException;


public class Exception_4 {
	public static void main(String[] args) throws Exception {
		
		try { 
			
			Exception ex_1 = new NoPermissionException("���� ���� ���� ���� ����");
			throw ex_1;
		}
		
		catch (Exception e) {
		
			System.out.println("���� ����: " + e);
			e.printStackTrace();
		}
		
		
	}
}
