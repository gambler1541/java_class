package java_417;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayout_2 extends Frame implements ActionListener{

	Button first,prev,next,last;
	Panel buttons;
	Panel slide;
	Panel card1,card2,card3,card4,card5; // slide�� ���Ե� Panel

	CardLayout card;


	public CardLayout_2(String str) {

		super(str);

		slide = new Panel();
		card = new CardLayout();

		slide.setLayout(card);

		// Button�� ���� panel

		buttons = new Panel();
		buttons.setLayout(new FlowLayout());

		first = new Button("<<");
		prev = new Button("<");
		next = new Button(">");
		last = new Button(">>");

		buttons.add(first);
		buttons.add(prev);
		buttons.add(next);
		buttons.add(last);


		card1 = new Panel();
		card1.setBackground(Color.green);
		card1.add(new Label("ù��° ������"));

		card2 = new Panel();
		card2.setBackground(Color.orange);
		card2.add(new Label("�ει�° ������"));

		card3 = new Panel();
		card3.setBackground(Color.cyan);
		card3.add(new Label("��������° ������"));

		card4 = new Panel();
		card4.setBackground(Color.gray);
		card4.add(new Label("�׳׳׳׹�° ������"));

		card5 = new Panel();
		card5.setBackground(Color.red);
		card5.add(new Label("�ٴٴٴٴٹ�° ������"));

		first.addActionListener(this); 	// anonymous class => ���ุ�ϰ� no return
		prev.addActionListener(this); 
		next.addActionListener(this); 
		last.addActionListener(this); 

		// slide(panel)�� card1(panel)�� "1~5"�� �̸����� �߰�
		slide.add(card1,"1");
		slide.add(card2,"2");
		slide.add(card3,"3");
		slide.add(card4,"4");
		slide.add(card5,"5");

		add("South", buttons);
		add("Center", slide);

		setSize(400,400);
		setVisible(true);

		card.show(slide, "3");

	}
	public static void main(String[] args) {
		new CardLayout_2("CardLayout Test~~~~");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Button obj = (Button)e.getSource();

		if (obj.equals(next)) {
			card.next(slide);
		}
		if (obj.equals(last)) {
			card.last(slide);
		}
		if (obj.equals(prev)) {
			card.previous(slide);
		}
		if (obj.equals(first)){
			card.first(slide);
		}
	}


}
