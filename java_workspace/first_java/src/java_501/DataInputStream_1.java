package java_501;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStream_1 {
	public static void main(String[] args) throws IOException{
		
		File tFile = new File("C://kbs/data_11.txt");
		
		if (!tFile.exists()) {
			System.out.println("파일이 존재하지않습니다");
			System.exit(1);
		}
		FileInputStream fis = new FileInputStream(tFile);
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readByte());
		System.out.println(dis.readShort());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
	}
}
