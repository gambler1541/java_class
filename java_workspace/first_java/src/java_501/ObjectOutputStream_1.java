package java_501;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectOutputStream_1 {
	public static void main(String[] args) throws IOException{
		
		Date date = new Date();
		String str = new String("�Ƹ��ٿ� ���� ��ſ� �Ϸ� \r\n");
		
		FileOutputStream fos = new FileOutputStream("C://kbs/obbb_1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeInt(500);
		oos.writeObject(str);
		oos.writeObject(date);
		System.out.println("FileOutputStream ����");
	
		oos.flush();
		oos.close();
	}
}
