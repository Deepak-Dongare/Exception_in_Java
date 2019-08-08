package Exception;

import java.util.Scanner;

class InvalidAgeException extends Exception{  
	 InvalidAgeException(String s){  
	super(s);  
	//	System.out.println(s);
	 }  
	}  
class TestCustomException1{  
  
    static void validate(int age)throws InvalidAgeException{  
     if(age<18)  
      throw new InvalidAgeException("not valid");  
     else  
      System.out.println("welcome to vote");  
    }

     
   public static void main(String args[]){  
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter AGE");
	   int age=sc.nextInt();
      try{  
      validate(age);  
      }catch(Exception m){System.out.println("Exception occured: "+m);}  
  
      System.out.println("rest of the code...");  
  }  
   }
