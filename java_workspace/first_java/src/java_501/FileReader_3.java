package java_501;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader_3 {
	public static void main(String[] args) {
		try {
			// ���� ��ü ����
			File file = new File("C://kbs/aaa.txt");
			
			// ��ĳ�ʷ� ���� �б�
			Scanner scan = new Scanner(file);
			
			while (scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			}catch (FileNotFoundException e) {
		}
		
		
	}
}
