package my.first.pac;

public class Consover {
	
	public Consover () 
	{
		System.out.println("Default Constructor");
	}
	public Consover (int a) 
	{
		System.out.println(+a);
	}
	
	public Consover (int a ,float b) 
	{
		System.out.println(a+ " " +b);
	}
	public Consover (String a ,int b) 
	{
		System.out.println(a+" "+b);
	}
	

	public static void main(String[] args) {
		

		Consover obj=new Consover();

		Consover obj1=new Consover(1);

		Consover obj2=new Consover(2,6f);

		Consover obj3=new Consover("Navami",8);
		
		
		
		
		
	}

}
