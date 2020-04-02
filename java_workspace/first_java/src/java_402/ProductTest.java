package java_402;

class Product
{
	static int count = 1000;
	int serialNo;
	
	
	{// method area¿¡ Á¸Àç
	serialNo = count;
	++ count;
	}
	
	public Product() {
		
	}
}


public class ProductTest {
	public static void main(String[] args) {
		
		Product pro_1 = new Product();
		Product pro_2 = new Product();
		Product pro_3 = new Product();
		
		System.out.println("pro_1 serialno: " + pro_1.serialNo);
		System.out.println("pro_2 serialno: " + pro_2.serialNo);
		System.out.println("pro_3 serialno: " + pro_3.serialNo);
		
		
	}
}
