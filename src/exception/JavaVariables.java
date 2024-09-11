package exception;

public class JavaVariables {
	static int x;
	int y=100;
	static void m1() {
		System.out.println("static method");
	}
	void m2() {
		System.out.println("instance method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
JavaVariables j=new JavaVariables();
System.out.println(j.y);
System.out.println(x);
m1();
j.m2();

	}

}
