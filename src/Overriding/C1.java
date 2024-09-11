package Overriding;

public class C1 extends P1 {
	public void login (String username, String password)
	{
		System.out.println("submit method");
	}
	

	public static void main(String[] args) {
		
	
		P1 obj=new P1();
		obj.login("String username", "String password");
		obj = new C1();
		obj.login("test", " pass");
		
	}
	

}


