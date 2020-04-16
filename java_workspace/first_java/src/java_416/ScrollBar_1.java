package java_416;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;

public class ScrollBar_1 extends Frame {

	public ScrollBar_1(String title) {
		super(title);
		
		Scrollbar srb1 = new Scrollbar(Scrollbar.VERTICAL, 10,100,0,255);	// bar의 위치, 크기, 최소값 ,최대값(최대값-bar의 크기)
		Scrollbar srb2 = new Scrollbar(Scrollbar.HORIZONTAL,100,50,0,255);
		
		add("West",srb1);
		add("Center",new Label("스크롤바 테스트~~~"));
		add("South",srb2);
		
		setSize(200,200);
		setVisible(true);
	}
		
	
	public static void main(String[] args) {
		new ScrollBar_1("스크롤바 테스트~~");
	}
}
