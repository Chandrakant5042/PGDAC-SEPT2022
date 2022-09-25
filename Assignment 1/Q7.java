import java.util.Scanner;

class Q7{
	static int i=1;
	static int Return(int n)
{    
	   if(i<=10)
	   {   System.out.println(i);
		return Return(i++) ; 
	   }
	   else 
	return 0;
		
} 
	public static void main(String args[]){
	
	Return(i);
	
	}	
}
