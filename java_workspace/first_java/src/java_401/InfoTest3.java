package java_401;


class Info3
{
	private String name;
	private String address;
	private int age;
	
	
	public Info3(String name, String address,int age){
		
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	
	public Info3(String name, String address) {
		
		this(name,address,0);
	}
	
	public Info3(String address, int age) {
		
		this("anonymous",address,age);
	}
	
	
	public Info3()
	{
		this("anonymous","?",0);
	}
	

	public void show()
	{
		System.out.println("이름  : " + name + "\t주소	: " + address + "\t나이  : " + age);
	}
	
}




public class InfoTest3 {
	public static void main(String[] args) {
		
		Info3 info1 = new Info3("수선화","서울",55);
		Info3 info2 = new Info3("들국화","제주도");
		Info3 info3 = new Info3("부산",23);
		Info3 info4 = new Info3();
		
		info1.show();
		info2.show();
		info3.show();
		info4.show();
		
	}
}
