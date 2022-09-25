import java.util.Scanner;
class Q12{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a");    //5
	int a=sc.nextInt();
	
	System.out.println("Enter b");       //4
	int b=sc.nextInt();
	int i=0;
	if(a<b)
	
    {
			while(i<b)
			{
				a++;
				

				i++;
			}
			System.out.println("sum is "+a);
	}
	else
		{
			while(i<a)
			{
				b++;
				

				i++;
			}
			System.out.println("sum is"+b);
		}
}
}
