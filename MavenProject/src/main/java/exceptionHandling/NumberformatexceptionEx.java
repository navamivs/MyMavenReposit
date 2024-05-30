package exceptionHandling;





public class NumberformatexceptionEx {
	
	public void show()
	{
		try
		{
		String s="Nvs";//nvs cannot be converted to int
		int a=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("hi");
		}
	}

	public static void main(String[] args) {
		
		NumberformatexceptionEx  obj=new NumberformatexceptionEx() ;
		obj.show();
		
	}

}
