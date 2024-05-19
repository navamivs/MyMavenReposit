package my.first.pac;
import java.util.Scanner;

class Array
{
	
	
	public static int add (int m)
	{
		Scanner obj=new Scanner(System.in);
		int a[]=new int[m];
		int sum=0;
		System.out.println("Enter the Values");
		for(int i=0;i<m;i++)
		{
			a[i]=obj.nextInt();
			sum=sum+a[i];
			
		}
		
		return sum;
	}
		
}
public class ArrayAddition {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int m,r;
		
		System.out.println("Enter the Array limit");
		m=obj.nextInt();
		//int a[]=new int[m];
		
		r=Array.add(m);
		System.out.println("The added value is   "+r);
		
	}

}
