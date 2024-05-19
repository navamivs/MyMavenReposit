package my.first.pac;

public class Blockstaticeg {
	
	
	
	public Blockstaticeg()
	{
		System.out.println("Constructor");	
	}
	
	public Blockstaticeg(int a)
	{
		System.out.println("Constructor with Parametric value " +a);	
	}
	static
	{
		int a=5;
		System.out.println("Value of a in Static block "+a);
	}

	
	
	public static void main(String[] args) {
	
		Blockstaticeg obj=new Blockstaticeg();
		Blockstaticeg obj1=new Blockstaticeg(4);
		Blockstaticeg obj2=new Blockstaticeg();
		Blockstaticeg obj3=new Blockstaticeg(7);
		
		
		
		

	}

}
