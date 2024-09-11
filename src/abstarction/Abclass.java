package abstarction;

public abstract class Abclass {
	
//	Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//	Another way, it shows only essential things to the user and hides the internal details, for example, 
//	sending SMS where you type the text and send the message.
//	You don't know the internal processing about the message delivery.
//	There are two ways to achieve abstraction in java
	
//	 Abstract class (0 to 100%)
//	 Interface (100%)( if u using java 8 and below).

//	A class which is declared as abstract is known as 
//	an abstract class. It can have abstract and non-abstract methods


	 Abclass()
	{
		System.out.println("default constructor method");
	}
	 
	 public	 abstract void login();
	 
	 
	 public static void submit()
	 {
		 System.out.println("submit method");
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
