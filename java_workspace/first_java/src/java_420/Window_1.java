package java_420;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Window;

public class Window_1 extends Frame{

	Window[] win = new Window[40];	
	Color[] color = {Color.RED, Color.YELLOW, Color.green,
			Color.CYAN, Color.BLUE};
	
	int x = 0;
	int y = 0;

	public Window_1(String title) {
		super(title);

		for (int i = 0; i < 40; i++) {
			win[i] = new Window(this);
			win[i].setBackground(color[i % 5]);

			Label lbl = new Label(i + "번 윈도우");

			win[i].add(lbl);
			if ((i / 10) % 2 != 1) {
				x += 10;
				y += 10;
				win[i].setBounds(150 + (x), 150 + (y), 100, 100);
			}
			else {
				x += 10;
				y -= 10;
				win[i].setBounds(150 + (x), 150 + (y), 100, 100);
			}


			win[i].setVisible(true);
		}

		setLocation(110, 160);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Window_1("Window test");
	}
}
