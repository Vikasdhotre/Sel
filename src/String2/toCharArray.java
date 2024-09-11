package String2;

public class toCharArray {

	public static void main(String[] args) {
		String s2="testing is best and testing is good and testing is last and testing is first";
		char[] values=s2.toCharArray();
		
		for(int i=0;i<=values.length-1;i++)
		{
			System.out.println(values[i]);
		}
	}

}
