package Inheritance;

public class T2 extends T1{
	
	T2()
	{
		System.out.println("T2  class default");
	}
	
	public static void cancel()
	{
		System.out.println("i am cancel method");
	}
	
	public  static void login()
	{
		System.out.println(" Iam login method");
	}

		
	public static void main(String[] args) {
		
		T2 obj=new T2();
		//login();error will come
		cancel();		

	}

}
