package my.first.pac;

public class Swapnum 
{
	
	 private int a=5;
	private int b=6;
	
	
	public void swap1()
	{
		int a=this.b;
		this.b=this.a;
		this.a=a;

		System.out.println(" b: " +this.b);
		
		System.out.println(" a " +this.a);
	}

	public static void main(String[] args) {
		
		Swapnum obj=new Swapnum();
		obj.swap1();


	}

}
