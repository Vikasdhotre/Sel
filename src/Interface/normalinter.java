
package Interface;

public  class normalinter implements inter1,inter2
{

	public static void main(String []args)
	{
		normalinter obj=new normalinter();
		obj.login();
		obj.Add();
		inter1.cancel();
		inter2.cancel();
	}

	
	public void login() {
		System.out.println("login ");
		
	}

	
	public void Add() {
		System.out.println("add");
		
	}

	
	
}

