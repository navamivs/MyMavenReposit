package my.first.pac;
import java.util.Scanner;
public class Arraysum {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the limit of the array 1 and array 2");
		int m=obj.nextInt();
		
		int a[]=new int[m];
		int b[]=new int[m];
		int c[]=new int[m];
		
		System.out.println("Enter "+m+"values for array 1 ");
		
		
			for(int i=0;i<m;i++)
			{
			a[i]=obj.nextInt();
				
		     }
			
		System.out.println("Enter "+m+"values for array 2 ");
		
			for(int i=0;i<m;i++)
			{
				b[i]=obj.nextInt();
				
		    }
			System.out.println("Array 1    +   Array 2 is " );

	for(int k=0;k<m;k++)
	{
		c[k]=a[k]+b[k];
	
	System.out.print(" " +c[k]);
	}
	
	

	}

}
