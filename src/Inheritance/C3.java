package Inheritance;

public class C3 extends C2{
	
	//grand son class(sub class)
	C3()
	{
		System.out.println(" C3  default constructor");
	}
	
	public static void submit()
	{
		System.out.println("i am submit method");
	}
	
	
	
	
	public static void main(String[] args) {
		C3 obj=new C3();
		login();
		cancel();		
		submit();
		}

}
