import java.util.Scanner;
class P4{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of rows:");
	int n=sc.nextInt();
	
	for(int i=1; i<=n; i++)
	{ for(int j=2;j<=i;j++)
		{
		System.out.print(" ");
		}
	
	for(int j=1;j<=n;j++)
		{
		if((i+j)<=n+1)	
			System.out.print("*");
	
		}
	System.out.println();
	}
	
	}
}