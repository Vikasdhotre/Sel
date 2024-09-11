package Overriding;

public class P1 {
//	Over riding:-same method and same parameters
//	If subclass (child class) has the same method as declared in the parent class,
//	it is known as method overriding in Java.
//
//	In other words, If a subclass provides the specific
//	implementation of the method that has been declared by one of its parent class,
//	it is known as method overriding.
//
//
//
//	conditions:-
//	1) method should not be static
//	2) both class should be in IS-A relation ( parent and child relationship)
//	3) method should have same methodname and same parameters with count and data types.

	

//	Super-------- parent class, base
//	super and this keyword we cant use in static method
	
	P1()
	{
		System.out.println(" parent");
	}
	
	P1(int x)
	{
		System.out.println(" perameter");
	
	}

	int x=100;
	
	public void login(String username, String password)
	{
		System.out.println("login method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
