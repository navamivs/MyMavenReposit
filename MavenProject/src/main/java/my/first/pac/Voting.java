package my.first.pac;
import java.util.Scanner;
class vote
{
	public static boolean age(int a)
	{
		if(a>=18)
		{
		return true;
		}
		else
       return false;
	}
}

public class Voting {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String n;
		int i;
		System.out.println("Enter the name of the candidate");
		n=obj.nextLine();
		System.out.println("Enter the age of the candidate");
		i=obj.nextInt();
		
boolean r=vote.age(i);
if(r==true)
{
	System.out.println("The candidate "+n+" is ELIGIBLE to vote");
}

else
	System.out.println("The candidate "+n+" is NOT ELIGIBLE to vote");
	
		
	}

}
