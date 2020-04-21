package java_420;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Window;

public class Pwindow_1 extends Frame{

	Window[] win = new Window[40];
	Color[] color = {
			Color.RED,
			Color.YELLOW,
			Color.GREEN,
			Color.CYAN,
			Color.BLUE
	};

	int x = 0;
	int y = 0; // x,y 값을 조정

	public Pwindow_1(String title) {
		super(title);

		for (int i = 0; i < 40; i++) {
			win[i] = new Window(this);
			win[i].setBackground(color[i % 5]); // 5개의 배열에 있는 컬러로 반복

			Label lbl = new Label(i + "윈도우");

			win[i].add(lbl);
			if ((i / 10) % 2 != 1 ) {
				x += 10;
				y += 10;
				win[i].setBounds(150 + (x), 150 + (y),100, 100 );
			}
			else {
				x += 10;
				y -= 10;
				win[i].setBounds(150 + (x), 150 + (y),100, 100 );
			}
			win[i].setVisible(true);
		}	
		setLocation(110, 160);
	}
	public static void main(String[] args) {
		new Pwindow_1("Window ");
	}
}
