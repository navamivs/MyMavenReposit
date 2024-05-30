package my.first.pac;
import java.util.Scanner;
class Exm1
{
	
	static int a[]= {3,5,5};
	static int l;
	static int s[]=new int[l];
}

public class Arraystat {
	
	
	static int c[]= {78,8,6,9};

	public static void main(String[] args)
	
	
	{
	Scanner obj=new Scanner(System.in);
	int b[]= {1,2,3,4,5};
	System.out.println(" Local    ");
	for(int i=0;i<b.length;i++)
	{
	System.out.print(" "+b[i]);
	}
	
	System.out.println();
	System.out.println(" In  public class   ");
	for(int i=0;i<c.length;i++)
	{
	System.out.print("  "+c[i]);
	}
	
	System.out.println();
	System.out.println(" In  default class   ");
	for(int i=0;i<Exm1.a.length;i++)
	{
	System.out.print("  "+Exm1.a[i]);
	}
	System.out.println();
	
	System.out.println("Enter the limit");
	Exm1.l=obj.nextInt();
	System.out.println("limit is" +Exm1.l);
	
	System.out.println("Enter  values for an array");
	int d=Exm1.l;
	
	for(int i=0;i<d;i++)
	{
		Exm1.s[i]=obj.nextInt();
	System.out.print("  "+Exm1.s[i]);
	}
	
	
		
		}

	}


