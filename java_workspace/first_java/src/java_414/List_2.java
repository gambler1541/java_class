package java_414;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;

public class List_2 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("List Test~!@!@");
		
		ff.setLayout(new FlowLayout());
		
		List list = new List(4, true);		//4 => 4°³¾¿ º¸¿©ÁÜ, true => ´ÙÁß¼±ÅÃÀ» Çã¿ë
		Label lbl = new Label("List Test");
		
		List list2 = new List(3, false);
		Label lbl2 = new Label("Flower List");
		
		ff.add(lbl);
		list.add("386DX");
		list.add("486DX");
		list.add("486DX66");
		list.add("ÆæÆ¼¾ö4");
		list.add("¿¡½½·ĞXP3");
		list.add("µà¾óÄÚ¾î");
		list.add("¶óÀÌÁ¨");
		list.add("½´ÆÛ");
		
		ff.add(list);
		
		ff.add(lbl2);
		list2.add("°³³ª¸®");
		list2.add("¹«±ÃÈ­");
		list2.add("¼ö¼±È­");
		list2.add("º¢²É");
		list2.add("¸ñ·Ã");
		list2.add("ÇÒ¹Ì²É");
		list2.add("¾È°³²É");
		list2.add("µ¿¹é²É");
		
		ff.add(list2);
		
		ff.setVisible(true);
		ff.setSize(400,300);
	}
}
