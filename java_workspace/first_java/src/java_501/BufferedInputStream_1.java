package java_501;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedInputStream_1 {
	public static void main(String[] args) throws Exception {
		int i =0;
		String file;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�о�� ���� �̸�  ");
		file = read.readLine();
		
		System.out.println(file + " ���� ���� ");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);	// �Ƚᵵ �Ǵ� �κ������� �� ������ ��ġ�鼭 �� ȿ���� ������
		
		while ((i = bis.read()) != -1) {
			System.out.print((char)i);
		}
		bis.close();
	}
}
