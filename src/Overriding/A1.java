package Overriding;

public class A1 {
	
//	this----------> current class, child drive 
//
//	super and this keyword we cant use in static method

	
	A1()
	{
		System.out.println(" parent");
	}
	
	public void add()
	{
		System.out.println("add method of parent");
	}
	
	A1(int x)
	{
		System.out.println(" parameter");
	}
	
	int x=100;
	
	public void login(String username, String password)
	{
		System.out.println("login method");
	}
	

	public static void main(String[] args) {
		
		
		
	}

}
