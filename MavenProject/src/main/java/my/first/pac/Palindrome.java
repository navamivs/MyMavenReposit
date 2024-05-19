package my.first.pac;

import java.util.Scanner;

public class Palindrome {
	static int rem=0;
	
	public static int rev(int n)
	{
		
		int rem=0;
		int m;
		while(n!=0)
			
		{
			m=n%10;
			rem=((rem*10)+m);
			n=n/10	;
			
		}
	
		
		
		return rem;
		
		
	}
	
	
	
	public static void result(int n)
	{
		
		int k=Palindrome.rev(n);
		
		if(k==n)
		{
			System.out.println("The number  "+n+ " is Palindrome");
		}
		
		else
			System.out.println("The number  "+n+ " is not Palindrome");
				
		
	}
	
	
	

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number to find the reverese and to check Palindrome or not");
		int num=obj.nextInt();
		
		int r=Palindrome.rev(num);
		System.out.println("Reverse of "+num+ " is" +r);
		Palindrome.result(num);
		

	}

}
