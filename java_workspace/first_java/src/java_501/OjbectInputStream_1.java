package java_501;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class OjbectInputStream_1 {
	public static void main(String[] args) throws Exception {
		String str, date_str;
		Date date;
		
		FileInputStream fis = new FileInputStream("c://kbs/obbb_1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.print(ois.readInt());
		str = (String) ois.readObject();
		
		System.out.print("\n" + str);
		
		date =(Date)ois.readObject();
		
		date_str = (date.getYear() + 1900) + "³â";
		date_str += (date.getMonth() + 1) + "¿ù";
		date_str += (date.getDate()) + "ÀÏ";
		
		System.out.println(date_str);
		System.out.println();
		
		ois.close();
	}
}
