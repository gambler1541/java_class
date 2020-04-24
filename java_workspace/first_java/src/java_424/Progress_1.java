package java_424;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Progress_1 extends JFrame{
	
	JProgressBar progress;
	JLabel lbl_info;
	
	public Progress_1(String title) {
		super(title);
		
		progress = new JProgressBar();
		progress.setMinimum(0); 		//���α׷��� �ּҰ�
		progress.setMaximum(200);		//���α׷��� �ִ밪
		progress.setValue(0);			//���α׷��� ���۰�
		
		lbl_info = new JLabel("");
		
		this.getContentPane().add(progress, "North");
		getContentPane().add(new JLabel("JProgress Test"), "Center");
		getContentPane().add(lbl_info, "South");
		
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setSize(300, 200);
		setVisible(true);
		progress_start();
	}	
	
	private void progress_start() {
		
		int i;
		
		try {
			for (i = 0; i <= 200; i += 5) {
				progress.setValue(i);			// �ε� �� ó�� �þ
				Thread.sleep(200);
				lbl_info.setText(""+i+"% �� ������ ~~~");
				
//				if (i == 50) {
//					throw new Exception();
//				}
				if (i == 200) {
					lbl_info.setText(" �ٿ� �Ϸ� !!!!" );
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
			lbl_info.setText("�����߻�####");
		}
	}
	public static void main(String[] args) {
		new Progress_1("Progress Test~~~");
	}
}
