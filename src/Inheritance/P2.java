package Inheritance;

public class P2 extends P1 {
	
	
	P2()
	{
		System.out.println("P2 class default");
	}
	
	public static void cancel()
	{
		System.out.println("i am cancel method p2");
	}
	
	public static void main(String[] args) {
		
		P2 obj=new P2();
		login();
		cancel();
	}

}
