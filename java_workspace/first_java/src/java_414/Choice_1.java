package java_414;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Choice_1 extends Frame{

		public Choice_1(String str) {
			super(str);
			
			setLayout(new FlowLayout());
			
			Label lbl = new Label("국가를 선택하시오", Label.CENTER);
			Label lbl2 = new Label("수도를 선택하시오", Label.CENTER);
			Choice choice = new Choice();
			Choice choice2 = new Choice();
			
			choice.setBackground(new Color(255,0,180));
			choice2.setBackground(new Color(180,0,255));
			
			choice.add("대한민국");
			choice.add("중국");
			choice.add("캐나다");
			choice.add("러시아");
			choice.add("미국");
			choice.add("프랑스");
			choice.add("스페인");
			
			choice2.add("서울");
			choice2.add("베이징");
			choice2.add("오타와");
			choice2.add("모스크바");
			choice2.add("워싱턴");
			choice2.add("파리");
			choice2.add("마드리드");
			
			add(lbl);
			add(choice);
			add(lbl2);
			add(choice2);
			
			setSize(300, 200);
			setVisible(true);
		}
	public static void main(String[] args) {
		new Choice_1("choice test");
	}
}
