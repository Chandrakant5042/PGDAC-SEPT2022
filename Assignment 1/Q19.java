import java.util.Scanner;

class Q19
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no. ");
		int n=s.nextInt();
		System.out.println();
		int even=2;
		for(int i=1;i<=n;i++)  
		{
		  System.out.print(even+" ");	
		  even=even+2;
		}
	
	}
	
}	

