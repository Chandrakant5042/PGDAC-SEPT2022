import java.util.Scanner;

class Q2
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a no. to find Factorial");
		int a=s.nextInt();
		
		int fact=1,n=1;
	
		while(n<=a)      
		{
			fact=fact*n;    
			n++;
		}
		
		System.out.println("Factorial of "+a+" is "+fact);
		
		
	}
	
}	



