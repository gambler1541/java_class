package java_401;

class Card_1{
	
	final int NUMBER;
	final String KIND;
	
	static int width = 100;
	static int height = 250;
	
	public Card_1(String kind, int number) {
		
		KIND = kind;
		NUMBER = number;
		
	}
	
	
	public Card_1() { 
		
		this("HEART",1);
		
	}
	
	public String toString() {
		
		return " " + KIND + " " + NUMBER;	
	}
	
}




public class FinalCard_1 {
	public static void main(String[] args) {
		
		Card_1 card1 = new Card_1("SPADE", 10);
		Card_1 card2 = new Card_1();

		
		System.out.println(card1);
		System.out.println(card2);
		
		System.out.println(card1.KIND);
		System.out.println(card2.KIND);
		
		System.out.println(card1.NUMBER);
		System.out.println(card2.NUMBER);
		
	}
}
