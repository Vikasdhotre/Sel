package Strings;

//In Java, string is basically an object that represents sequence of char values.
//
//Java String literal is created by using double quote.
//
//String name="Testing";
//
//
//note1== 
//1)"==" refers to address pointing if address is differene it will return false
//2) .equals refers only the value of give strings.


public class Stringsmethod {

	public static void main(String[] args)
	{
		String name="Testing1";//it will point only to scp area (only one object created) 
		String name1=new String("Testing");//new keyword -> it will create 2 copies one in scp area and other in non-scp area...it will point only non-scp area 
		name1 = name1.intern();
		System.out.println(name);
		System.out.println(name1);
		//equals and ==
		System.out.println(name==name1);//false
		System.out.println(name.equals(name1));//true
		
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode());
	}

}
