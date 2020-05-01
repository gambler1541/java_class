package java_501;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class File_1 {

	static int totalFiles = 0;
	static int totalDirs = 0;

	public static void main(String[] args) throws Exception{

		if (args.length != 1) { // 매개변수가 1이 아니라면(매개변수가 한개일때만 프로그램이 동작)
			System.out.println("Usage : Java File_1 directory");
			System.exit(0);
		}

		File dir = new File(args[0]); // 매개변수의 첫번째(0번 index)

		if (!dir.exists() || !dir.isDirectory()) {
			System.out.println("유효하지않는 디렉토리입니다.");
			System.exit(1);
		}
		
		printFileList(dir); // File객체가 넘어감
		
		System.out.println();
		System.out.println("총 : " + totalFiles + " 개의 파일");
		System.out.println("총 : " + totalDirs + " 개의 디렉토리");
	}

	static void printFileList(File dir) throws IOException {
		System.out.println(dir.getAbsolutePath() + "디렉토리"); //getAbsolutePath() 절대경로를 보여줌
		File[] files = dir.listFiles();	//
		
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
		
		System.out.println(fileNum + " 개의 파일, " + dirNum + " 개의 디렉토리");
		System.out.println();
		
		for (int i = 0; i < subDir.size(); i++) {
			int index = Integer.parseInt((String)subDir.get(i));
			printFileList(files[index]);
		}
	}
}