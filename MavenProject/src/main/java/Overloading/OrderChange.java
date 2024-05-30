package Overloading;

public class OrderChange {

	public void getvalue(int a,float b)
	{
		System.out.println(a+" : "+b);
	}
	
	public void getvalue(float a,int b)
	{
		
		
		System.out.println(a+b);
	}
	
	
	
	public static void main(String[] args) {
		OrderChange obj=new OrderChange();
		obj.getvalue(3, 6.9f);
		obj.getvalue(7.1f, 2);

	}

}
