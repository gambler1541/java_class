package java_416;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class Font_1 {
	public static void main(String[] args) {
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

		Font[] fonts = ge.getAllFonts();

		for (int i = 0; i < fonts.length; i++) {
			System.out.println("   " + fonts[i].getFontName());
		}



	}
}
