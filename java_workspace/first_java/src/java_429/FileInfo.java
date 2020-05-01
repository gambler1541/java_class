package java_429;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileInfo {
	public static void main(String[] args) throws IOException{
		
		File file = new File(args[0]);
		
		System.out.println(args[0] + " ���� �� ����   *");
		System.out.println("���� ��� : " + file.getAbsolutePath());
		System.out.println("ǥ�� ��� : " + file.getCanonicalPath());
		System.out.println("������ : " + new Date(file.lastModified()));
		System.out.println("���� ũ�� : " + file.length());
		System.out.println("�б� �Ӽ� : " + file.setReadable(false));
		System.out.println("���� �Ӽ� : " + file.canWrite());
		System.out.println("���� ���1 : " + file.getParent());
		System.out.println("���� ���2 : " + file.getPath());
		System.out.println("���� �Ӽ� : " + file.isHidden());
		System.out.println("���� ���� : " + file.isFile());
	}
}
