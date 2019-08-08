package Exception;

import java.util.Scanner;

public class CW5 {
	
	
	//int a,b;
		
		void m1(int a,int b){
			m2(a,b);
			
		}
		void p(int a, int b){
		//	this.a=a;
			//this.b=b;
			
			m1(a,b);
		}
		void m2(int a,int b){
			
			m3(a,b);
			
		}
			void m3(int a,int b) throws ArithmeticException{
				{	
			//try {
			//{		a=a;
				b=b;
				int c=a/b;
				System.out.println(c);
				
			}
			}
		//	}catch(ArithmeticException ae) {
				
			//	System.out.println("Diveded by zero");
				
		//	}catch(IndexOutOfBoundsException i) {
				
		//		System.out.println("IndexOutOfBoundsException");
				
			//}
	//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CW5 d=new CW5();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		
		int a=sc.nextInt();
		
		int b=sc.nextInt();
		
		try {
		d.p(a,b);
		
		}catch(ArithmeticException ae )
		{
			System.out.println("divided by zero");
			
		} /*
			 * finally { System.out.println("finally block"); }
			 */
		System.out.println("finally  ");
	}

}
