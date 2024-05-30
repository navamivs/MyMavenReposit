package exceptionHandling;

public class ArithematicEx {

	public void show()
	{
		try
		{
			int a=10/0;
		}
	
	
	catch(Exception e)
	{
		System.out.println("Execption Handled" );
		System.out.println(e);
	}
	}
	public static void main(String[] args) {
	
		ArithematicEx obj=new ArithematicEx();
		obj.show();
		
	}

}
