package my.first.pac;
import java.util.Scanner;
class Nameage
{
	
	public static void getnam()
	
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the name");
		String c=obj.nextLine();
		System.out.println("Enter the age");
		String b=obj.nextLine();
		Nameage.display(c,b);
	}
	
	public static void display(String n,String a)
	{
		
		System.out.println("Name is "+n);
		System.out.println("Age is "+a);
		
	}
}





public class Namepgm {

	public static void main(String[] args) {
		
		Nameage.getnam();
		
	

	}

}
