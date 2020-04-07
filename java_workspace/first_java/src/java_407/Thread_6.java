package java_407;

import javax.swing.JOptionPane;

public class Thread_6 {
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("값을 입력하세요 ! ");
		
		System.out.println("입력한 값  : " + input + " 입니다.");
		
		
		for (int i = 10; i > 0; i--) {
			
			System.out.println("\t\t" + i);
			try
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
