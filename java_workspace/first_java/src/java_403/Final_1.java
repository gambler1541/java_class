package java_403;

final class WordProcess{
	
	void Input() {};
	void Edit() {};
	void Print() {};
	void About() {
		System.out.println("Korea 회사 개발 ~~~~~");
	}
}


class NewWordProcess extends WordProcess{
	
	void About()
	{
		System.out.println("Seoul 회사 개발 %%%%%");
	}
}


public class Final_1 {
	public static void main(String[] args) {
			NewWordProcess obj = new NewWordProcess();
			obj.About();
	}
}
