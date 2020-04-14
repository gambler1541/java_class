package java_414;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Checkbox_2 extends Frame{
	
	Checkbox cbx1 ,cbx2, cbx3, cbx4;
	CheckboxGroup cbg, cbg2;
	
	public Checkbox_2(String str) {
		super(str);
		
		setLayout(new FlowLayout());
		Label lbl = new Label("좋아하는 계절은?",Label.CENTER);
		lbl.setBackground(new Color(0,200,255));
		add(lbl);
		
		cbg = new CheckboxGroup();	
		cbx1 = new Checkbox("봄",cbg,true);
		cbx2 = new Checkbox("여름",cbg,true);
		cbx3 = new Checkbox("가을",cbg,false);
		cbx4 = new Checkbox("겨울",cbg,false);
		
		add(cbx1); add(cbx2);
		add(cbx3); add(cbx4);
		
		Label lbl2 = new Label("좋아하는 산은?",Label.CENTER);
		lbl2.setBackground(new Color(0,255,70));
		add(lbl2);
		
		cbg2 = new CheckboxGroup();
		Checkbox cbx5 = new Checkbox("지리산",cbg2,false);
		Checkbox cbx6 = new Checkbox("한라산",cbg2,false);
		Checkbox cbx7 = new Checkbox("관악산",cbg2,false);
		Checkbox cbx8 = new Checkbox("금강산",cbg2,true);

		add(cbx5); add(cbx6);
		add(cbx7); add(cbx8);

		setSize(240, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Checkbox_2("체크 박스 예제1");
	}
	
}
