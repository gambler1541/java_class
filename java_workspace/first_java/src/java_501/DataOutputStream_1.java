package java_501;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_1 {
	public static void main(String[] args) throws IOException {
		File tFile = new File("C://kbs/data_11.txt");
		FileOutputStream fos = new FileOutputStream(tFile);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(99);
		dos.writeByte(7);
		dos.writeShort(100);
		dos.writeInt(100);
		dos.writeLong(1000);
		dos.writeFloat(89.345f);
		dos.writeDouble(4567.4322);
		dos.flush();
		// ���ۿ� ���� ��� ��Ʈ�� ���
		// flush() �޼ҵ带 ȣ������ ������ ���۷θ� ����� �Ǳ� ������ ������ ������������
		// �ƹ��� �����͸� ���� ���ϴ� ��찡 �߻��Ҽ� �ִ�.
		
		System.out.println("data_11.txt �� " + dos.size() + " byte ����");
		dos.close();
		
	
	}
}
