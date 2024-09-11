package Overriding;

public class Audi extends Car{
	
	
	public void color() {
		System.out.println("White...");
	}
	
	public static void main(String[] args) {
		
		Car obj = new Audi();
		
		obj.color();
		
	}

}
