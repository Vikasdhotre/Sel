package abstarction;

public class normal extends Abclass{

	
	normal()
	{
		System.out.println("normal method of child");
	}

	public void login()
	{
		System.out.println("login method");
	}
	
	public static void main(String[] args) {
		normal obj=new normal();
		obj.login();
		submit();
		
	}

}
