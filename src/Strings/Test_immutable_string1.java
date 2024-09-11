package Strings;

//String objects are immutable. Immutable simply means unmodifiable or unchangeable.
//
//Once String object is created its data or state can't be changed but a new String object is created.

//concat
 class Test_immutable_string1 {

	public static void main(String[] args)
	{
	       String s="Sachin";  
		   s=s.concat(" Tendulkar");  
		   System.out.println(s);  	
	}

}
