package java_408;




public class Test_1 {
	public static void main(String[] args) {
		
		Test_1 test = new Test_1();
		Test_1 test1 = test;
		Test_1 test2 = new Test_1();
		
		System.out.println("Test hashcode : "+test.hashCode());
		System.out.println("Test1 hashcode: "+test1.hashCode());
		System.out.println("Test2 hashcode: "+test2.hashCode());
		System.out.println();
		test = test2;
		System.out.println();
		System.out.println("Test hashcode : "+test.hashCode());
		System.out.println("Test1 hashcode: "+test1.hashCode());
		System.out.println("Test2 hashcode: "+test2.hashCode());
		
	}
}
