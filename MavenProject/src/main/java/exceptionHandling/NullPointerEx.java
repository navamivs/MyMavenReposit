package exceptionHandling;

public class NullPointerEx {
	
	public void show()
	{
		
		try
		{
		String s=null;
		System.out.println(s.length());
	
		}
		
		
		
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
		try
		{
			int a=1/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}

	public static void main(String[] args) {
		
		NullPointerEx obj=new NullPointerEx();
		
         obj.show();
	}

}
