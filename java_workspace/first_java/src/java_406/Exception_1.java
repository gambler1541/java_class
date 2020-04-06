package java_406;

import java.io.*;		// java.io ���� �ִ� ��� Ŭ������ import(*)

public class Exception_1 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			
			try {
				System.out.println("ù��° ���� �Է��ϼ���!!> ");
				int num1 = Integer.parseInt(input.readLine());
				
				System.out.println("�ι�° ���� �Է��ϼ���!!> ");
				int num2 = Integer.parseInt(input.readLine());
				
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		
			}

			catch (NumberFormatException e2) {
				System.out.println(" �Է°��� ���ڿ��� �մϴ�.");
				e2.printStackTrace();
				System.out.println(e2.getMessage());
			}
			
			catch (ArithmeticException e) {
				System.out.println(" �и� 0 �� �ü� �����ϴ�. ");
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
			catch (Exception e3) {
				e3.printStackTrace();
			}
			
			finally {	// error�� ������� �׽� ����
				System.out.println("�׽� ���´�~");
			}
			
			
		}
	}
}
