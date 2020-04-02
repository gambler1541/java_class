package java_402;

class Tv{
	
	boolean power;	//  ����
	int channel;	//  ä��
	
	
	void power() { power = !power; }

	void channelUp() { channel++; }
	
	void channelDown() { -- channel; } 

}

class CaptionTv extends Tv{
	
	boolean caption; // ĸ�� on & off
	
	void displayCaption(String text) {
		
		if (caption) {
			System.out.println(" text = " + text);
		}
	}
}


public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 11;
		ctv.channelUp();
		ctv.channelUp();
		
		ctv.caption=true;	
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello KBS ~~~");
		
		ctv.displayCaption("Hello CNN @@@");

		ctv.channelDown();
		ctv.channelDown();
		ctv.channelDown();
		ctv.channelDown();
		ctv.channelDown();
		System.out.println(ctv.channel);
	}
}
