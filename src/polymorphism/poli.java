package polymorphism;

public class poli {
//	polymorphism:-
//	Polymorphism is derived from two Greek words, “poly” and “morph”, which mean “many” and “forms”, respectively.
//	Hence, polymorphism meaning in Java refers to the ability of objects to take on many forms.
//
//	1) Over loading:- complile time Polymorphism 
//
//	In class same method, but different parameters or arugments.
//
//	what is out of Over loading-- to increase the readability of code
//
//	To Achieve Over loading--- same method , but parmaters count should different or datatype should different
//
//	we cant acheive overloading by changing the return type.


	public static void login(String username, String password, int otp)
	{
		System.out.println("HOD login code");
	}
	
	public static void login(String username, String password )
	{
		System.out.println("Student login code");
	}
	
	public static void login (String username, int otp)
	{
		System.out.println("cleark login code");
	}
	

	public static void main(String[] args) {
		login("vikas","pass123",5632);
		login("sagar","more");
		login("vijay",1005);

	}

}
