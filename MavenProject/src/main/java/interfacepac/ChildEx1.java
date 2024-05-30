package interfacepac;

public class ChildEx1 implements ParentEx1 
{
	public void display()
	{
		System.out.println("Display");
		System.out.println(ParentEx1.a);
	}
	
	
	public static void main(String[] args)
	{
		ParentEx1 ob=new ChildEx1();
		ob.display();
		ChildEx1 obj=new ChildEx1();
		obj.display();
	}
}
