package Selenium123;

public class controlstatements {
	
	//Que-1: simple if 
//	public static void main(String[] args) {
//	
//		
//		int x=10;
//		int y=20;
//		if(x+y<20)
//		{
//			System.out.println(" executed");
//		}//output no return any string(result is empty)
//	}
	
	
//	//Que-2:if else condition
	
//	public static void main(String[] args) {
//		int x=10;
//		int y=20;
//		
//		if(x+y<20) {
//			System.out.println("executed");
//		}else {
//			System.out.println("not executed");
//		}
//	} //output not executed

//	if(condition) {    
//		statement 1; //executes when condition is true   
//		}  
//		else{  
//		statement 2; //executes when condition is false   
//		}  

//	public static void main(String[]args) {
//		int x=10;
//		int y=12;
//		
//		if(x+y<10) {
//			System.out.println("x + y is less than 10");
//		}else {
//			System.out.println("x + y is grater than 20");
//		}
//	}
	
	//Que-3 even and odd no
//	public static void main(String[]args) {
//		int no=10;////Check if the number is divisible by 2 or not  
//		
//		if(no%2==0) {
//			System.out.println("even no");
//		}else {
//			System.out.println("odd no");
//		}
//	}//output-even no 
	
	//Que-4: && and ||
//	public static void main(String[]args) {
//		int x=11;
//		int y=20;
//		
//		if(((x+y>20) && (x>10 ))  ||  ( x>10) )
//		{
//			System.out.println("executed");
//		}
//		else
//		{
//			System.out.println("not executed");
//		}
//		
//	}
	
//	//Que-5:if else condition-1, else if condition-2,last final else print orginal output
//		public static void main(String[]args) {
//			
//			String city = "Agra";
//			if(city=="Meerut") 
//			{
//				System.out.println("city is merrut");
//			}
//			else if(city == "Noida")
//			{
//				System.out.println("city is noida");
//			}
//			else if(city == "Agra")
//			{
//				System.out.println("city is agra");
//			}
//			else 
//			{
//				System.out.println(city);
//			}
//			//output:city is agra
//		}
	
	//Que-6 show the resul grade wise
//	public static void main(String[]args) {
//		int marks=100;
//		
//		if(marks<50)
//		{
//			System.out.println("Fail");
//		}
//		else if(marks>=50 && marks<60)
//		{
//			System.out.println("D grade");
//		}
//		else if(marks>=60 && marks<70)
//		{
//			System.out.println("C grade");
//		}
//		else if(marks>=70 && marks<80)
//		{
//			System.out.println("B grade");
//		}
//		else if(marks>=80 && marks<90)
//		{
//			System.out.println("A grade");
//		}
//		else if(marks>=90 && marks<=100)
//		{
//			System.out.println("A+ grade");
//		}
//		else
//		{
//			System.out.println("invalid");
//		}
//	}output depend on int marks

	//Nasted if condition
//	 if()
//	 {
//	         if()
//	          {
//
//	           }
//
//	 }
	
	
	//Que-7:Nasted if condition
//	public static void main(String[]args) {
//		int age=19;
//		int weight=50;
//		
//		if(age>20)
//			{
//			if(weight>49)
//			{
//				
//			System.out.println("Elegible");	
//			}
//		
//		else
//		{
//			System.out.println("Not Elegible under weight");
//		}
//		}
//		else
//	    
//		{
//			System.out.println("Not Elegible under age");
//		}
//	}
	
	//Que-8 switch condition
//	public static void main(String[]args) {
//		String name="Jr.NTR";
//		
//		switch(name)
//		{
//
//		case "Charan":System.out.println( "Charan");
//		case "Ravi":System.out.println("Ravi");
//		break;
//		case "Jr.NTR":System.out.println("no name");
//		System.out.println(name);
//
//		}
//		
//	}
	
	
//	//switch break condition
//	public static void main(String[]args) 
//	{
//		int month=7;//yaha per jo bhi no lenge usake upar depend karta ki konsa month print karvana hai
//		String monthString="";
//		//Switch statement 
//		switch(month)	
//		{
//			//case statements within the switch block 
//			
//		case 1: monthString="1 - January";  
//	    break;    
//	    case 2: monthString="2 - February";  
//	    break;    
//	    case 3: monthString="3 - March";  
//	    break;    
//	    case 4: monthString="4 - April";  
//	    break;    
//	    case 5: monthString="5 - May";  
//	    break;    
//	    case 6: monthString="6 - June";  
//	    break;    
//	    case 7: monthString="7 - July";  
//	    break;    
//	    case 8: monthString="8 - August";  
//	    break;    
//	    case 9: monthString="9 - September";  
//	    break;    
//	    case 10: monthString="10 - October";  
//	    break; 
//	    case 11: monthString="11 - November";  
//	    break;    
//	    case 12: monthString="12 - December";  
//	    break;    
//	    default:System.out.println("Invalid Month!");    
//	    }
//		//Printing month of the given number  
//	    System.out.println(monthString);  
//		
//	}

//	//nasted if ka example
//	public static void main(String[]args) 
//	{
//		
//		for(int i=1;i<=10;i++)
//		{
//			if(i==5)
//			{
//			System.out.println(i);
//			}
//		}
//	}

	
	public static void main(String[]args)
	{
		for(int i=1;i<=3;i++)
		{
			
			for(int j=1;j<=3;j++)
			{
				 System.out.println( i+"" +j);
				 
			}
			
		}
	}
	
	
	
}

