public class InputOutput
 {
	 <!-- .read()메서드 사용시 예외처리는 필수-->
  public static void main(String[] args) throws Exception

   {
    int a;
	while (true){

		System.out.print("문자를 입력하세요!! ");
		<!-- .read()메서드는 입력 받은 하나의 자료에 대해 ascii code를 return 해줌   -->
		a = System.in.read();
		<!-- 값을 입력하면(enter) 입력 값과 Enter의 ascii(13,11) code가 read()메서드에 의해 입력됨  -->
		System.in.read();
		System.in.read();
		
		System.out.println("입력한 문자는" +(char)a +"입니다.");
		System.out.println("Ascii Code : " + a + "입니다.");
	
		}	
	}
 }