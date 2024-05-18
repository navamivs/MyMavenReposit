package my.first.pac;
import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int f=0;
		System.out.println("Enter the limit of the array ");
		int m=obj.nextInt();
		System.out.println("Enter "+m+"values for array  ");
		int a[]=new int[m];
		
		for(int i=0;i<m;i++)
		{
		a[i]=obj.nextInt();
			
	     }
	
		System.out.println("Enter the value to be searched ");
		int x=obj.nextInt();
		
		
		for(int i=0;i<m;i++)
		{
		if(a[i]==x)
		{
			System.out.println("The searched value is found in the Possition "+i);
			f++;
		}
				
				
		}
		if(f==0)
		{
			System.out.println("Not found");
		}
		

	}

}
