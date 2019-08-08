package Exception;

import java.util.Scanner;

public class CW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			int c=a/b;
			System.out.println(c);
	
	}catch(ArithmeticException a1){
		System.out.println("divided by zero");
		
		
		
		}
	}

}
