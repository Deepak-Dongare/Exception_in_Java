package Exception;

import java.util.Scanner;

public class CW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			int c=a/b;
			
		}catch(ArithmeticException e) {
			
			System.out.println("Enter value of b>0 ");
			
			
		}

	}

}
