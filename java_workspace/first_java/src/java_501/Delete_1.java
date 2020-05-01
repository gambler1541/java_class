package java_501;

import java.io.File;

public class Delete_1 {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage : java Delete <file or director> ");
			System.exit(1);
		}
		try {
			delete(args[0]);
		}catch (IllegalArgumentException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	// ���� ���� �޼ҵ�
	// ������ �����̳� ���丮�� �����ϱ� ���� ������ �������� Ȯ��
	// ������ �߻��ϸ� illeagalargumentException�� �߻�
	static void delete(String filename) {
		File ff = new File(filename);
		
		// �����̳� ���丮�� �����ϴ����� ���� ���� �Ǿ����� Ȯ��
		if (!ff.exists()) {
			fail("Delete : no such file or director : " + filename);
			// System.exit(1);
		}
		
		if (!ff.canWrite()) {
			fail("Delete : write protected : " + filename);
		}
		// ���丮�̸� ��� �ִ��� Ȯ��
		if (ff.isDirectory()) {
			String[] files = ff.list();
			
			if (files.length > 0) {
				fail("Delete : directory not empty : " + filename);
			}
		}
		// ��� �˻縦 ��� �ϸ� ���� ����
		boolean success = ff.delete();
		if (!success) {
			fail("Delete : deletion failed !!!!!");
		}
		else 
			System.out.println("���� �Ǿ����ϴ�.");
	}
	private static void fail(String msg) throws IllegalArgumentException{
		throw new IllegalArgumentException(msg);
	}
}
