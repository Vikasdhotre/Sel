package Selenium123;

public class constructor {

	
//	constrcutor****:-
//	1) it is special type method.
//	2) default constrcutor and parameterized constrcutor
//	3)constrctor should name of classname
//	4) when we created object then default and paramterized constrcutor is called...
//	5) by default JDK will create default constructor..if programmer 
//	not created
//	6) we cant make as  static and no return type
//	--------
//	why we need a constructor
//	it is used to initized the object...

	//non  paramterized constructor
	
//	int roll;
//	String name;
//	String location;
//	
//	public constructor()
//	{
//		System.out.println("Default constructor");
//	}
//	
//	public constructor (int rollnumber, String fullname, String fulllocation )
//	{
//		roll=rollnumber;
//		
//		 name=fullname;
//		 location=fulllocation;
//		// 
//	}
//	
//	public void display() {
//		System.out.println("roll "+roll+" name "+name+" location "+location);
//	}
//	public static void main(String[] args) {
//	
//		constructor c=new constructor();
//		
//		constructor c1=new constructor(101,"raja","hyd");
//		c.display();
//		c1.display();
//				
//		
//	}
	
	//datatype variables;
	int roll;
	String name;
	String location;
	
	
	//null print hote
	 public constructor()
	 {
		 System.out.println("Default constructor");
	 }
	 
	 
	 public constructor(int rollnuber, String fullname, String fulllocation)
	 {
		 roll =rollnuber;
		 name =fullname;
		 location =fulllocation;
	 }
	 
	 
	 public void display()
	 {
		 System.out.println(roll + name + location);
	 }
	 
	 public static void main(String []args)
	 {
		 
			//Constrctor obj= new Constrctor();
		 	//obj creation
		 
		 constructor naresh=new constructor(10  , "   NareshIt", "  KPHP");
		 constructor surya=new constructor(11  , "  suryaips", "  banglore");
		 constructor Ravi=new constructor(12  , "  Ravi", "  pune");
		 naresh.display();
		 surya.display();
		 Ravi.display();
		
	 }
	 
	
	
	
	
	
	
	
	
}
