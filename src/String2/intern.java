package String2;

//It will remove the object memory address to String pool memory..


public class intern {

	public static void main(String[] args) {
		String s1=new String("hello");  
		String s2="hello";
	    String s3=	s1.intern();
	    
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
	}

}
