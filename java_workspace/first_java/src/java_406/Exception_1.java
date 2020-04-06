package java_406;

import java.io.*;		// java.io 내에 있는 모든 클래스를 import(*)

public class Exception_1 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			
			try {
				System.out.println("첫번째 값을 입력하세요!!> ");
				int num1 = Integer.parseInt(input.readLine());
				
				System.out.println("두번째 값을 입력하세요!!> ");
				int num2 = Integer.parseInt(input.readLine());
				
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		
			}

			catch (NumberFormatException e2) {
				System.out.println(" 입력값이 숫자여야 합니다.");
				e2.printStackTrace();
				System.out.println(e2.getMessage());
			}
			
			catch (ArithmeticException e) {
				System.out.println(" 분모에 0 이 올수 없습니다. ");
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
			catch (Exception e3) {
				e3.printStackTrace();
			}
			
			finally {	// error와 상관없이 항시 나옴
				System.out.println("항시 나온다~");
			}
			
			
		}
	}
}
