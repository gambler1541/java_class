package java_429;

import java.io.File;

public class Dir {
	public static void main(String[] args) {
		
		// 현재의 디렉토리 출력
		
		File dir = new File("src/java_429");		// 인자의 경로
		String[] strs = dir.list();
		
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		
	}
}
