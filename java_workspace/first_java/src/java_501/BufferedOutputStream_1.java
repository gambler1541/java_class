package java_501;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Date;

public class BufferedOutputStream_1 {
	public static void main(String[] args) throws Exception{
		
		String file, str;
		
		Date date = new Date();
		
		str = " ���� ���� �ð�  �ڸ�� : \r\n" + date + "\r\n";
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("���� �̸� : ");
		file = read.readLine();
		
		System.out.println("������ ���ڿ� !!!!!");
		str += read.readLine();
		
		byte[] byte_str = str.getBytes();
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		bos.write(byte_str);
		bos.close();
		
		System.out.println(file + "�� ���������� ����  �Ͽ����ϴ�.");
	}
}
