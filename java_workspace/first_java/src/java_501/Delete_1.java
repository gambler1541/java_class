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
	
	// 삭제 정적 메소드
	// 지정한 파일이나 디렉토리를 삭제하기 전에 삭제가 가능한지 확인
	// 문제가 발생하면 illeagalargumentException을 발생
	static void delete(String filename) {
		File ff = new File(filename);
		
		// 파일이나 디렉토리가 존재하는지와 쓰기 방지 되었는지 확인
		if (!ff.exists()) {
			fail("Delete : no such file or director : " + filename);
			// System.exit(1);
		}
		
		if (!ff.canWrite()) {
			fail("Delete : write protected : " + filename);
		}
		// 디렉토리이면 비어 있는지 확인
		if (ff.isDirectory()) {
			String[] files = ff.list();
			
			if (files.length > 0) {
				fail("Delete : directory not empty : " + filename);
			}
		}
		// 모든 검사를 통과 하면 파일 삭제
		boolean success = ff.delete();
		if (!success) {
			fail("Delete : deletion failed !!!!!");
		}
		else 
			System.out.println("삭제 되었습니다.");
	}
	private static void fail(String msg) throws IllegalArgumentException{
		throw new IllegalArgumentException(msg);
	}
}
