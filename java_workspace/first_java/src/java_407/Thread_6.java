package java_407;

import javax.swing.JOptionPane;

public class Thread_6 {
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("���� �Է��ϼ��� ! ");
		
		System.out.println("�Է��� ��  : " + input + " �Դϴ�.");
		
		
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
