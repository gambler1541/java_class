package java_429;

import java.io.File;

public class Dir {
	public static void main(String[] args) {
		
		// ������ ���丮 ���
		
		File dir = new File("src/java_429");		// ������ ���
		String[] strs = dir.list();
		
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		
	}
}
