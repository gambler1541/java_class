package java_501;

import java.io.File;
import java.util.ArrayList;

public class File_1 {

	static int totalFiles = 0;
	static int totalDirs = 0;

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Usage : Java File_1 directory");
			System.exit(0);
		}

		File dir = new File(args[0]);

		if (!dir.exists() || !dir.isDirectory()) {
			System.out.println("��ȿ�����ʴ� ���丮�Դϴ�.");
			System.exit(1);
		}
		printFileList(dir);
		
		System.out.println();
		System.out.println("�� : " + totalFiles + " ���� ����");
		System.out.println("�� : " + totalDirs + " ���� ���丮");
	}

	static void printFileList(File dir) {
		System.out.println(dir.getAbsolutePath() + "���丮");
		File[] files = dir.listFiles();
		
		ArrayList subDir = new ArrayList();
		
		for (int i = 0; i < files.length; i++) {
			String filename = files[i].getName();
			
			if (files[i].isDirectory()) {
				filename = "[" + filename + "]";
				subDir.add(i + "");
			}
			System.out.println(filename);
		}
		int dirNum = subDir.size();
		int fileNum = files.length - dirNum;
		
		totalFiles += fileNum;
		totalDirs += dirNum;
		
		System.out.println(fileNum + " ���� ����, " + dirNum + " ���� ���丮");
		System.out.println();
		
		for (int i = 0; i < subDir.size(); i++) {
			int index = Integer.parseInt((String)subDir.get(i));
			printFileList(files[index]);
		}
	}
}