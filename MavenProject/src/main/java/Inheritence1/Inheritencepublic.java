package Inheritence1;

class C extends Inheritencepublic
{
	public void showC()
	{
		
		System.out.println("In C show")	;
		
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println("In second static  main show");
			C obj=new C();
			obj.showC();
			obj.mainshow();

			System.out.println("In void main inherited ");
			}
	
}

public class Inheritencepublic  {
	
	
	public void  mainshow()
	{
		System.out.println("In first main show")	;
	}

	public static void main(String[] args) 
	{
		C obj=new C();
		
	    C.main(args);
	    
	    System.out.println("In void main last");
		
	
	

	}
		
	}


