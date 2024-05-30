package abstraction;

abstract class Calculator extends ParCalculator
{
	public void mul()
	{
		System.out.println("Multiplication.......");
	}
}

class Cal extends Calculator
{

	
	public void div() {
		System.out.println("Divide in Cal Child");
		
	}
	
}

public class Childcalculator extends ParCalculator
{

	
	
	public void div() 
	{
		System.out.println("Divide in Child");
		
	}
	public static void main(String[] args) 
	{
		ParCalculator obj =new Childcalculator();
		obj.div();
		obj.add();
		
		Cal o=new Cal();
		o.mul();
		o.div();
		o.add();
		
		
		
		
		
		
		
		/*obj=new Cal();
		obj.div();
		Calculator ob=(Calculator)obj;
		ob.mul();*/
	
		

	}


}


