package Inheritance;

public class P3 extends P1{
	
	P3()
	{
		System.out.println("P3 default constructor");
	}
	
	public static void submit()
	{
		System.out.println("i am submit methodd P3");
	}
	

	public static void main(String[] args) {
		P3 obj=new P3();
		login();
		//cancel();if we are use this call this method error will come
		submit();
		

	}

}
