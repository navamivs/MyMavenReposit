

//getting values in array and sum
package my.first.pac;

import java.util.Scanner;
class Arrayabc
{
	static int k=5;
	static int c[]=new int[k];
	
	public static int abc(int b[],int x)
	{
		int sum=0;
		for(int i=0;i<x;i++)
		{
		 
			sum+=b[i];
			
			
		}	
		
		return sum;
	}
}

public class Arraymethod {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	
	/*System.out.println("Enter limit");
	int m;
	m=obj.nextInt();
	int a[]=new int[m];
	System.out.println(" Enter the values");
	for(int i=0;i<m;i++)
	{
	   a[i]=obj.nextInt();
	
		
	}
		
		int r=Arrayabc.abc(a,m);
		
		System.out.println("The Sum of array is "+r); */
		
		
		
		
		//System.out.println("Enter limit for k");
		//Arrayabc.k=obj.nextInt();
		//System.out.println(Arrayabc.k);
		System.out.println(" Enter the values");
		
		for(int i=0;i<5;i++)
		{
			Arrayabc.c[i]=obj.nextInt();
		   System.out.println(Arrayabc.c[i]);
			
		}

	}

}
