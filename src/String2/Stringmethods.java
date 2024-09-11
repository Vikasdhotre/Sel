package String2;

public class Stringmethods {
	
	//rivers String
	
	public static void main(String[] args)
	{
	
		String s2="testing";
		char[]values=s2.toCharArray();
		
		for(int i=values.length-1;i>=0;i--)
		{
			System.out.print(values[i]+" ");
		}
	}
}
