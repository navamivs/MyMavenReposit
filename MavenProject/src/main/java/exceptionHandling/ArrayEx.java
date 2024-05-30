package exceptionHandling;

public class ArrayEx {
	
	public void array()
	{
		try
		{
			int a[]= {1,3,4,5,8};
			a[7]=8;
			//System.out.println(a[9]);
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Execption Handled  " +e);
		}
		
		
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		ArrayEx obj=new ArrayEx();
		obj.array();
		
	}

}
