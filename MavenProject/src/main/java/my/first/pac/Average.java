package my.first.pac;
import java.util.Scanner;
public class Average {
	
	
	public static int add(int a,int b,int c)
	{
		int avg;
		avg=(a+b+c)/3;
		return avg;
				
	}
	
	public static float add(float a,float b,float c)
	{
		float avg;
		avg=(a+b+c)/3;
		return avg;
				
	}	

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a,b,c,r;
		float d,e,f,g;
		System.out.println("Enter 3 integer values to find the average");
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		r=Average.add(a, b, c);
		System.out.println("The Average of "+a+" "+b+" "+c+ "is  "+r); 
		System.out.println("Enter 3 pointed values to find the average");
		d=obj.nextFloat();
		e=obj.nextFloat();
		f=obj.nextFloat();
		g=Average.add(d,e,f);
		System.out.println("The Average of "+d+" "+e+" "+f+ "is  "+g); 
				

	}

}
