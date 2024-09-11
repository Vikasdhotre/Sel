////package Finalkeyword;
//
////The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:
////
////variable--stop changing
////method--stop over riding
////class==stop in heritance
//
//
//
////final class Bike {}
//
////class Honda1 extends Bike // eroor milega kyunki hamane upar ka class final decaler kiya hai
//
//{
//	 void run()
//	 {
//		 System.out.println("running safely with 100kmph");
//	 }
//	 
//	 public static void main(String[] args) {
//		 Honda1 obj=new Honda1();
//		 obj.run();
//	}
//	
//}//Output:Compile Time Error
//
//class Bike9
//{  
//	 final int speedlimit=90;//final variable  
//	 void run()
//	 {  
//	 // speedlimit=400;  
//	 }  
//	 
//	 public static void main(String args[])
//	 {  
//	 Bike9 obj=new  Bike9();  
//	 obj.run();  
//	 }  
//}
//
//class bike1{  
//	  final void run()
//	  {
//		  System.out.println("running");
//		  }  
//}  
//
//
//class Honda extends bike1{  
//	  // void run()
//	   {
//		   System.out.println("running safely with 100kmph");
//	   }  
//	     
//	   public static void main(String args[]){  
//	   Honda honda= new Honda();  
//	   honda.run();  
//	   }  
//	}  
//	
// 
//	
//	
//	
//	