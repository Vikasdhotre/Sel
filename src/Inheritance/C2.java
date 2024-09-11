package Inheritance;

public class C2 extends C1{

	//father of C3(sub class)
	C2()
	{
		System.out.println("C2  class default");
	}
	
	public static void cancel()
	{
		System.out.println("i am cancel method");
	}
		
	public static void main(String[] args) {
		
		C2 obj=new C2();
		login();
		cancel();		

	}

}
