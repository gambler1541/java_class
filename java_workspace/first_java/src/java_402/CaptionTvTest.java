package java_402;

class Tv{
	
	boolean power;	//  전원
	int channel;	//  채널
	
	
	void power() { 
		power = !power; 
		}

	void channelUp() {
		
		if (power){
			
			channel++;
			}
		}
	
	void channelDown() { 
		
		if (power) {
			-- channel; 
			}
		
		}	 

}

class CaptionTv extends Tv{
	
	boolean caption; // 캡션 on & off
	
	void displayCaption(String text) {
		
		if (caption) {
			System.out.println(" text = " + text);
		}
	}
}


public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		
		
		ctv.power();
		ctv.channel = 11;
		ctv.channelUp();
	
		ctv.caption=true;	
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello KBS ~~~");
		
		ctv.displayCaption("Hello CNN @@@");
		
		ctv.power();
		ctv.channelDown();
		ctv.channelDown();
		ctv.channelDown();
		ctv.channelDown();
		ctv.channelDown();
		System.out.println(ctv.channel);
	}
}
