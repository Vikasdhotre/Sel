package Strings;
//charAT()
//The Java String class charAt() method returns a char value at the given index number.
//
//The index number starts from 0 and goes to n-1, where n is the length of the string. 
//It returns StringIndexOutOfBoundsException, if the given index number is greater than or equal to this
//string length or a negative number.

public class charAt {

	public static void main(String[] args) {
		String name="Naresh It Solutionsfggvgjvjgvgjvjgvdddd12345412";
		
		System.out.println(name.charAt(10));
		System.out.println(name.length());
		System.out.println(name.charAt(name.length()-2));
	}

}
