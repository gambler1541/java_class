package java_406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_5 {
	public static void main(String[] args) {
		
	
		try {	
			
			input();
		} 
		
		catch (ArithmeticException e) {
			
			e.printStackTrace();
		}

		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		catch (NumberFormatException e) {
			
			e.printStackTrace();
		}
		
	}

	private static void input() throws ArithmeticException, IOException, NumberFormatException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			System.out.println("ù���� ���� �Է��ϼ���!!: ");
			int num1 = Integer.parseInt(in.readLine());
			
			System.out.println("�ι��� ���� �Է��ϼ���!!: ");
			int num2 = Integer.parseInt(in.readLine());
			
			dividing(num1, num2);
		}
	}
	
	public static void dividing(int x, int y) throws ArithmeticException {
			
		System.out.println(x +  " / " + y +" = " + (x/y));
		
	}
	
}
