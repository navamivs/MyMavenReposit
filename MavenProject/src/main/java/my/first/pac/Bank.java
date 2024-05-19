package my.first.pac;
import java.util.Scanner;
class Banking
{
	static int b=1000;

	public static int withdraw(int m)
	{
        int n=0;
		int r= Banking.dep(n);
		if(r>=m) 
		   {
			System.out.println("Amount "+m+ " has been Withdrawn");
			b=r-m;
			Banking.dep(0);
			}
		else
			System.out.println("Insufficient Balance" );
		
			return 0;
	}
	
	
	public static int dep(int de)
	{
   
	b=de+b;
	return b;	
	}
}



public class Bank {
	
	

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the name of the account holder");
		String n=obj.nextLine();
		int d=0;
		System.out.println("Enter the Account number of the account holder");
		int a=obj.nextInt();
		System.out.println("Account Holder"+n);
		System.out.println("Account Number"+a);
		int x;
		do {
		System.out.println("Select an option");
		System.out.println("1:Deposit");
		System.out.println("2:Withdraw");
		System.out.println("3:Balance Check");
		x=obj.nextInt();
		switch(x)
		{
			
		case 1: 
		if(x==1)
		{
		System.out.println("Enter the Amount to deposit");
		d=obj.nextInt();
		Banking.dep(d);
		System.out.println("Amount" +d+ "has been deposited ");
		break;
		
		}
		
		case 2:
			
		if(x==2)
		{
			System.out.println("Enter the Amount to Withdraw");	
			int w=obj.nextInt();
		Banking.withdraw(w);	
		break;
		}
		
		case 3:
		if(x==3)
		{
			int p =Banking.dep(0);	
			System.out.println("Balance Amount is  "+p); 
			break;
		}
		
		default:
			System.out.println("Invalid option Please run the code again");
		break;
		
		}}
		while(x==1||x==2||x==3);
		
	

	}

}
