package java_403;

final class WordProcess{
	
	void Input() {};
	void Edit() {};
	void Print() {};
	void About() {
		System.out.println("Korea ȸ�� ���� ~~~~~");
	}
}


class NewWordProcess extends WordProcess{
	
	void About()
	{
		System.out.println("Seoul ȸ�� ���� %%%%%");
	}
}


public class Final_1 {
	public static void main(String[] args) {
			NewWordProcess obj = new NewWordProcess();
			obj.About();
	}
}
