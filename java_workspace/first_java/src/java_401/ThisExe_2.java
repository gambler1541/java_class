package java_401;


class This_2 {
	
	String name;
	int age;
	char sex;
	
	
	public This_2(String name, int age, char sex) {
			
		this.name = name;
		this.age = age;
		this.sex = sex;
		
	}
	
	public This_2() {

		this("����ȭ",33,'m');
		
	
	}
	
	public This_2(String name, int age) {
		
		this(name, age, 'f');
		
	}
	
	public This_2(String name, char sex) {
		
		this(name, 27, sex);
		
	}
	
	public void display() {
		
		System.out.println("�̸�:  " + name + "	����:  " + age + "	����:  " + sex);
		
	}
	
	
}


public class ThisExe_2 {
	public static void main(String[] args) {
		
		This_2 this_1 = new This_2();
		This_2 this_2 = new This_2("������", 25);
		This_2 this_3 = new This_2("�ε鷹", 'f');
		This_2 this_4 = new This_2("�޸��̲�",34, 'f');
		
		this_1.display();
		this_2.display();
		this_3.display();
		this_4.display();
		
	}
}
