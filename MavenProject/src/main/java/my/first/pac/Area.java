package my.first.pac;
import java.util.Scanner;
public class Area {

	
	public static int areas(int a)
	{
	return a*a;	
	}
	
	public static int areas(int l,int b)
	{
	return ((l*b)/2);
	}
	
	public static float areas(float r)
	{
	return (3.14f*r*r);	
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		Scanner obj= new Scanner(System.in);
	
		System.out.println("Enter the length of square");
		int s=obj.nextInt();
		System.out.println("Enter the length and breadth of rectangle");
		int br=obj.nextInt();
		int lr=obj.nextInt();
		System.out.println("Enter the radius of circle");
		float cr=obj.nextFloat();
		
		int r1=Area.areas(s);
		int r2=Area.areas(br,lr);
		float r3=Area.areas(cr);
		
		System.out.println("Area of square  " +r1);
		System.out.println("Area of Rectangle  " +r2);
		System.out.println("Area of Circle  " +r3);
		
				

	}

}
