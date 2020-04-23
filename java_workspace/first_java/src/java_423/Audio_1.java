package java_423;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Audio_1 extends Applet implements ActionListener, ItemListener{

	AudioClip[] audio = new AudioClip[5];
	Label lbl_info;
	Button play, loop, stop;

	String[] audio_name = {"yahoo1.au", "that.hurts.au", "computer.au","spacemusic.au","gong.au"};
	Choice choice;
	int i = 0;		// �������� ����

	@Override
	public void init() {
		setLayout(new BorderLayout());

		for (int i = 0; i < audio_name.length; i++) 
			audio[i] = getAudioClip(getCodeBase(), audio_name[i]);
		
		choice = new Choice();
		for (int i = 0; i < audio_name.length; i++) 
			choice.add(audio_name[i]);
		
		play = new Button("���");
		loop = new Button("�ݺ�");
		stop = new Button("����");
		
		choice.addItemListener(this);
		play.addActionListener(this);
		loop.addActionListener(this);
		stop.addActionListener(this);
		
		Panel panel = new Panel();
		panel.add(play);
		panel.add(loop);
		panel.add(stop);
		
		add("North", choice);
		add("Center", lbl_info = new Label(audio_name[i] + "����", Label.CENTER));
		add("South", panel);
	
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		i = choice.getSelectedIndex();
		lbl_info.setText(audio_name[i] + " ����");
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		Button obj = (Button) e.getSource();
		
		if (obj == play) 
			audio[i].play();
		
		if (obj == loop) 
			audio[i].loop();
		
		if (obj == stop)
			audio[i].stop();
		
	}
}
