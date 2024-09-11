package Selenium123;

public class stringrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string="vikas thoti";
		String stringrev="";
		for(int i=string.length()-1;i>=0;i--) {
			stringrev=stringrev+string.charAt(i);
		}
		System.out.println("original string:"+string);
		System.out.println("enter stringrev:"+stringrev);
		
		
		
		
	}

}
