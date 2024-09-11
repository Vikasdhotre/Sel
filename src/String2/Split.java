package String2;

//Java String split()
//The java string split() method splits this string against given regular expression and returns a char array.

public class Split {

	public static void main(String[] args) 
	{
		String s2="testing is best and testing is good and testing is last and testing is first";
		String names[]=s2.split("testing",3);
		
		for (int i=0; i<=names.length-1;i++)
		{
			System.out.println(names[i]);
		}
	}

}
