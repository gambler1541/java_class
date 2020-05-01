package java_501;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader_3 {
	public static void main(String[] args) {
		try {
			// 파일 객체 생성
			File file = new File("C://kbs/aaa.txt");
			
			// 스캐너로 파일 읽기
			Scanner scan = new Scanner(file);
			
			while (scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			}catch (FileNotFoundException e) {
		}
		
		
	}
}
