package java_429;

import java.io.File;

public class JDir {
	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("����  : java Jdir c://korea.txt");
			System.exit(111);
		}
		
		File file = new File(args[0]);
		
		if (!file.exists()) {
			System.out.println(args[0] + "������ �������� �ʽ��ϴ�.");
			System.exit(0);
		}
		System.out.println("���� ��� : "+ file.getAbsolutePath());
		
		if (file.isDirectory()) {
			File[] list =file.listFiles();
			System.out.println(args[0]+ " ���丮 ���� ��� ��� ");
			
			for (int i = 0; i < list.length; i++) {
				if (list[i].isFile()) {
					System.out.println(list[i].getName() + "\t : " + list[i].length());
					System.out.println();
				}else {
					System.out.println(list[i].getName() + "\t [���丮]");
					System.out.println();
				}
			}
		}
		else {
			System.out.println(args[0] + " ���� �� ����");
			System.out.println("���� ũ�� : " + file.length());
			System.out.println("�б� �Ӽ�: " + file.canRead());
			System.out.println("���� ��� : " + file.getParent());
			System.out.println("���� �Ӽ� : " + file.isHidden());
			System.out.println("�ؽ� �ڵ� : " + file.hashCode());
		}
	}
}
