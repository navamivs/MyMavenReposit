package my.first.pac;
import java.util.Scanner;
public class Textiles 
{
	public static float price(int n)
	{
		Scanner obj=new Scanner(System.in);
		float sum=0f;
	float a[]=new float[n];
	
	System.out.println("Enter the Price  ");
     for(int i=0;i<n;i++)
     {
    	 a[i]=obj.nextFloat(); 
    	
     }
     for(int i=0;i<n;i++)
     {
    	 
    	 sum=sum+a[i];
    	
     }
     
     
     if (sum>=5000)
     {
    	 System.out.println("Total Price of all products is Rs "+sum+ "/-"); 
     Textiles.discount(sum);
     }
   
    
    	 return sum;
		
	}
	
	public static void discount(float s)
	{
		
	float d;
	d=(s*20)/100;
	s=s-d;
	System.out.println("Final Price with 20% discount is Rs  "+s+ "/-");
		
	}
	
	public static void main(String[] args) 
	{
		
	Scanner obj=new Scanner(System.in);
	float r=0f;
	
	System.out .println("Enter the no of items purchased");
	int n=obj.nextInt();
	
	r=Textiles.price(n);
	if(r<5000)
	System.out.println("Total Price of all products is Rs "+r+"/-");
	
		

	}

}
