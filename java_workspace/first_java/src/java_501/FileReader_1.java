package java_501;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileReader_1 {
	public static void main(String[] args) throws Exception{
		
		int i = 0;
		
		String file;
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�о�� ���� �̸��� �Է��ϼ��� ! ");
		file = read.readLine();
		
		System.out.println(file + " ���� ���� ********************** ");
		
		FileReader frr = new FileReader(file);
		
		while ((i = frr.read()) != -1) {	// ���� ���ٸ� -1 ����
			System.out.print((char) i );
		}
		frr.close();
	}
}
