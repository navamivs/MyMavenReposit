package my.first.pac;
import java.util.Scanner;

public class Fact {
	
	static long f=1l;
	
public static long factor(int n)
{
	
for(int i=1;i<=n;i++)
{

	f=f*i;

	
}
	
return f;	
	
}
	
	public static void main(String[] args)
			{
		
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value to find the Factorial");
	int num=obj.nextInt();
	long r=Fact.factor(num);
	 System.out.println("Factorial of "+num+" is " +r);
		
		
			}

}
