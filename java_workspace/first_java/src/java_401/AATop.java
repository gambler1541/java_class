package java_401;

class AA
{
	static class BB
	{
		static int bb = 25;
		static class CC
		{
			int cc = bb + 77;
		}
	}
	
}



public class AATop {
	public static void main(String[] args) {
		
		AA.BB.CC obj = new AA.BB.CC();
		
		
		System.out.println("CC 클래스 내부 변수 : " + obj.cc );
		
	}
}
