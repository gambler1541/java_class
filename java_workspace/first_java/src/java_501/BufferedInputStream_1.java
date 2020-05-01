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
		
		System.out.println("읽어올 파일 이름  ");
		file = read.readLine();
		
		System.out.println(file + " 문서 내용 ");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);	// 안써도 되는 부분이지만 이 과정을 거치면서 더 효울이 좋아짐
		
		while ((i = bis.read()) != -1) {
			System.out.print((char)i);
		}
		bis.close();
	}
}
