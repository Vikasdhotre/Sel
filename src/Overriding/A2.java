package Overriding;

public class A2 extends A1{

	A2()
	{
		super(10);
		
	}

	public  void add() 
	{
		
		System.out.println("Add method of child");
		super.add();
	}
	
	public  void login(String username,String password)
	{
       this.add();
	}
	public static void main(String[] args) 
	{
		A2 obj= new A2();
		obj.login("naresh", "IT");

	}

}
