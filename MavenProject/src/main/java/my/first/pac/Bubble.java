package my.first.pac;
import java.util.Scanner;
public class Bubble 
{

	public static void main(String[] args) 
	{

		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the limit of the array ");
		int m=obj.nextInt();
		int temp=0;
		System.out.println("Enter "+m+" values for array  ");
		int a[]=new int[m];
		
		for(int i=0;i<m;i++)
		{
		a[i]=obj.nextInt();
			
	     }
		
		System.out.println("Sorted Array is");
		for(int j=0;j<m-1;j++)
		{
		for(int i=0;i<m-1;i++)
		{
			if(a[i]>a[i+1])
			{
				
				temp=a[i];
				a[i]=a[i+1];
			    a[i+1]=temp;
			    
			   }
		
		}}
		
		
			for(int i=0;i<m;i++)
			{
				System.out.print(" "+a[i]);	
			}
		
		
		
		
	}

}
