package Overriding;

import net.bytebuddy.implementation.bind.annotation.Super;

public class P2 extends P1 {
    P2()
	{
		super(10);
		
	}
	
    public void login(String username, String password)
    {
    	super.login("test", "hello");
    	
    	System.out.println("testing method");
    	System.out.println("this is data");
    	System.out.println(super.x);
    }
	
	public static void main(String[] args) {
		P2 obj=new P2();
		obj.login("naresh","it");
		//System.out.println(super.x);
	}

}
