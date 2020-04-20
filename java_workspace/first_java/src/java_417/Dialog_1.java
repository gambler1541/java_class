package java_417;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Dialog_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("Dialgo Test");
		//ff.setSize(300, 200);	
		
		Dialog info = new Dialog(ff, "새로운 소식", false
				);
		
		info.setSize(140,90);
		info.setLocation(70,70);
		info.setLayout(new FlowLayout());
		
		
		Label msg = new Label("This is model Dialog", Label.CENTER);
		Button ok = new Button("OK"); 
		
		info.add(msg);
		info.add(ok);
		
		//ff.add(info)
		ff.setVisible(true);
		info.setVisible(true);
		
		
	}
}
