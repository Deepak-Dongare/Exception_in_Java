package Exception;

import java.util.Scanner;

public class CW4 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size");
		
		int size=sc.nextInt();
		
		int array[]=new int[size];
		try {
		for(int i=0;i<size;i++) {
			
			array[i]=sc.nextInt();
	
			
		}
		
		}catch(ArrayIndexOutOfBoundsException i) {
			
			System.out.println("Exception solve");
			
		}
	try {
		if(array[11]==10) {
			
		}
			
		

	}
	catch(ArrayIndexOutOfBoundsException i) {
		
		System.out.println("Exception solve");
	
	}
	catch(ArithmeticException a) {
		
		System.out.println("erroe");
	}
	
		
		
		
		
	
	
			}
	}
