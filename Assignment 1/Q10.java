import java.util.Scanner;

class Q10
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a No.");
		int a=s.nextInt();
		int sum=0;
		int digit;
		if(a<=0)
		{
			System.out.println("Enter Positive No ");
		}
		else
		{	
			while(a>0)    
			{
			  digit=a%10;				
			  sum=sum+dig;
			  a=a/10;
			}
			
			System.out.println("The Sum of Digits is: "+sum);
		}	
	}
	
}	
